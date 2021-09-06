/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Fisher
 */

/*
pseudocode:

implement input necessities
prompt user for a noun
store noun as string
prompt user for verb
store verb as string
prompt user for adjective
store adjective as string
prompt user for adverb
store adverb as string
return string with stored strings
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun= sc.nextLine();
        System.out.print("Enter a verb: ");
        String verb= sc.nextLine();
        System.out.print("Enter an adjective: ");
        String adj= sc.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb= sc.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adverb);
    }
}