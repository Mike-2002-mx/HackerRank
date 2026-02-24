package org.example;

public class PersistentBuggerVic {
    public static void main(String[] args) {
        Persist ps = new Persist();

        int n = 999;

        int p = ps.persistence(n);

        System.out.println(p);
    }
}


class Persist {
	public int persistence(long n) {
    
        int r = 0;
        while(String.valueOf(n).length() > 1) {

            int mult = 1;
            for(String d : String.valueOf(n).split("")) {
                mult = mult * Integer.parseInt(d);
            }
            n = mult;
            r++;
            
            }
            return r;
    }
}