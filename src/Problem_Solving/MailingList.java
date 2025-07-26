package Problem_Solving;
import java.util.Scanner;

/*
Problem Statement: Email Validation Checker
You are given a list of email addresses. Your task is to validate each email
based on specific rules and determine whether it is valid or invalid.

Example Input:
    5
    john.doe_123@example.com
    a..b@example.com
    user@.com
    user@com.
    john@doe@com

Expected output:
    true
    false
    false
    false
    false
 */

public class MailingList {

    public static boolean checkValidity(String email){
        if(email.chars().filter(ch -> ch =='@').count() != 1)
            return false;
        String[] parts = email.split("@");
        if(parts.length != 2) return false;
        String local = parts[0];
        String domain = parts[1];

        if(!checkLocal(local)){
            return false;
        }
        if(!checkDomain(domain)){
            return false;
        }
        return true;
    }

    public static boolean checkLocal(String local){
        int len = local.length();
        if (len == 0) return false;

        char[] characters = local.toCharArray();

        // 1. first and last character must be a letter or digit of local
        if(!Character.isLetterOrDigit(characters[0]) || !Character.isLetterOrDigit(characters[len-1]))
            return false;

        // 2. local can have '.' or '_' in between, but cannot be consecutive.
        for(int i=0; i<len; i++){
            if(!(characters[i] == '.' || characters[i] == '_' || Character.isLetterOrDigit(characters[i])))
                return false;
            // checks for consecutive '.' & '_'.
            if( i>0 && (characters[i] == '.' || characters[i] == '_') && characters[i] == characters[i-1])
                return false;
        }
        return true;
    }

    public static boolean checkDomain(String domain){
        String[] parts = domain.split("\\.");

        if( !domain.contains(".") || domain.startsWith(".") || domain.endsWith(".") ) return false;

        if (parts.length != 2) return false;

        for(int i=0; i<parts.length; i++){
            for(int j=0; j<parts[i].length(); j++){
                if(!Character.isLetterOrDigit(parts[i].charAt(j))) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        boolean[] results = new boolean[testcase];

        for(int i=0; i<testcase; i++){
            String email = sc.nextLine();
            results[i] = checkValidity(email);
        }

        for(int i=0; i<testcase; i++){
            System.out.println(results[i]);
        }
    }
}
