while(j< 6){
        System.out.printf("Enter ship %d location:\n",i);
        if(!input.hasNextInt()){
        System.out.println("Invalid input entered. Try again");
        continue;
        }
        p1Int1=input.nextInt();

        if(!input.hasNextInt()){
        System.out.println("Invalid input entered. Terminating...");
        continue;
        }
        p1Int2=input.nextInt();

        if(p1Int1< 0||p1Int1>4||p1Int2< 0||p1Int2>4){
        System.out.println("Invalid input entered. Try again...");
        continue;
        }
        player1[p1Int1][p1Int2]='@';
        j++;
        }
