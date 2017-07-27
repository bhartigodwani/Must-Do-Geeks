import java.io.*;
import java.util.*;
class Main{
    public static void main(String []args){
        ArrayList<Company> list = new ArrayList<Company>();
        list.add(new Company("Walmart", 21));
        list.add(new Company("Cisco", 23));
        list.add(new Company("Morgan", 28));
        System.out.println("incease sort by comparable class on package basis");
        Collections.sort(list);
        for(Company com : list){
            System.out.println(com.getName()+" "+com.getPkg());
        }
        
        System.out.println("\nsort by name reverse order");
        NameComparator nameCompare = new NameComparator();
        Collections.sort(list, nameCompare);
        for(Company com : list){
            System.out.println(com.getName()+" "+com.getPkg());
        }
        
        System.out.println("\nsort by package reverse order");
        PkgComparator pkgCompare = new PkgComparator();
        Collections.sort(list, pkgCompare);
        for(Company com : list){
            System.out.println(com.getName()+" "+com.getPkg());
        }
    }
}

class NameComparator implements Comparator<Company>{
    public int compare(Company c1, Company c2){
        return c2.getName().compareTo(c1.getName());
    }        
}

class PkgComparator implements Comparator<Company>{
    public int compare(Company c1, Company c2){
        if(c2.getPkg() > c1.getPkg())
            return 1;
        if(c2.getPkg() < c1.getPkg())
            return -1;
        return 0;
    }        
}
 
class Company implements Comparable<Company>{
    String name;
    float pkg;
    public Company(String name, float pkg){
        this.name = name;
        this.pkg = pkg;
    }
    
    public int compareTo(Company c){
        if(this.pkg > c.pkg) return 1;
        else if(this.pkg < c.pkg) return -1;
        else return 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public float getPkg(){
        return this.pkg;
    }
}
