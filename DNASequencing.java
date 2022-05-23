package dnasequencing;

public class DNASequencing {

    static int indexOfATG(final String codon) {
        return codon.indexOf("ATG");
    }

    static int indexOfTGA(final String codon) {
        return codon.indexOf("TGA");
    }

    static int dnaLength(final String dna) {
        return dna.length();
    }

    public static void main(final String[] args) {

        final String dna1 = "ATGCGATACGCTTGA";
        final String dna2 = "ATGCGATACGTGA";
        final String dna3 = "ATGCGATACGTGA";

        final String[] arrayDNA = {dna1, dna2, dna3};

        for (final String element : arrayDNA) {
            final int start = indexOfATG(element);
            final int stop = indexOfTGA(element);

            if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {

                final String protein = dna1.substring(start, stop);
                System.out.println("There is a protein! " + protein);
            } else {
                System.out.println("No protein found!");
            }
        }
    }
}
