  package awaa.awaa1.hii;
 
 class ArrayMulti {
 
   public static void main(String[] args) {
      String [][] groups = {
         {"Group 1", "Amara","Naya","Nafis"},
          {"Group 2", "Elzar","Elsa","Dwi"},
           {"Group 3", "Novi","Maryam",},

      };

      for (int i=0; i<groups.length; i++) {
         System.out.print("\n"+groups[i][0]+" : ");
         for (int j=1; j<groups[i].length; j++) {
         System.out.print(groups[i][j]+",");
         }
      }
   }
   
 }