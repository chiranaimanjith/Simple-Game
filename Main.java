class Main{
    public static void main(String args[]){
		    Player1 player= new Player1("Chirana", "Sword", 100);
            // System.out.println(player.getName());
            // System.out.println(player.getWeapon());
            // System.out.println(player.getHealth()); 
            
            player.damageByGun1();
            player.damageByGun1();
            player.damageByGun2();
            player.heal();

        // Player2 betterPlayer = new Player2("Iroshan", "Machine Gun",80, false);
        // betterPlayer.damageByGun1();

    }	
}
