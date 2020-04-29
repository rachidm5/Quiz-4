package polumorphisim;

 class p {


    void parent(int s) {
        System.out.println("parent");
    }

}

 class f extends p{

     void parent(int j,double r){
        System.out.println("child");
    }

}
