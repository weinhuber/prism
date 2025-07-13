package automata;

import owl.automaton.Automaton;
import owl.automaton.acceptance.BuchiAcceptance;
import owl.automaton.hoa.HoaWriter;
import owl.ltl.LabelledFormula;
import owl.ltl.parser.LtlParser;
import owl.translations.LtlTranslationRepository;
import owl.translations.ltl2ldba.AnnotatedLDBA;
import owl.translations.ltl2ldba.AsymmetricLDBAConstruction;

import java.util.HashSet;
import java.util.Set;

import static owl.translations.LtlTranslationRepository.applyPreAndPostProcessing;

public class LTL2LDBA {
    public static void main(String[] args) {
//        LabelledFormula inputFormula = null;
//
//        // get all args and merge them together in case of white-space
//        StringBuilder sb = new StringBuilder();
//        for (String arg : args) {
//            sb.append(arg).append(" ");
//        }
//        String mergedArgs = sb.toString().trim();
//
//        // get input from command line argument
//        if (args.length > 0) {
//            inputFormula = LtlfParser.parse(mergedArgs);
//            System.out.printf("Input formula: %s\n", inputFormula);
//        } else {
//            System.out.println("No input formula provided.");
//            System.exit(1);
//        }
        LabelledFormula inputFormula = null;
        inputFormula = LtlParser.parse("a & X((FG a) || (FG b))");

        Set<LtlTranslationRepository.Option> translationOptions = new HashSet<>();

        translationOptions.add(LtlTranslationRepository.Option.SIMPLIFY_AUTOMATON);
        translationOptions.add(LtlTranslationRepository.Option.SIMPLIFY_FORMULA);
        translationOptions.add(LtlTranslationRepository.Option.USE_PORTFOLIO_FOR_SYNTACTIC_LTL_FRAGMENTS);
        translationOptions.add(LtlTranslationRepository.Option.COMPLETE);


        Automaton ldbaPostprocessed = applyPreAndPostProcessing(AsymmetricLDBAConstruction.of(BuchiAcceptance.class).andThen(AnnotatedLDBA::copyAsMutable),
                LtlTranslationRepository.BranchingMode.DETERMINISTIC,
                translationOptions,
                BuchiAcceptance.class)
                .apply(inputFormula);

        // Output the automaton to the console
        String automataString = HoaWriter.toString(ldbaPostprocessed);
        System.out.println(automataString);
    }
}
