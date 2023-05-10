public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot(){


        numberOfPlants=(int)(Math.random()*90+10);

        int needsWaterID=(int)(Math.random()*2);
        if(needsWaterID==0){
            needsWater=false;
        } else{
            needsWater=true;
        }

        int plantID=(int)(Math.random()*5);
        if(plantID==0){
            plantName="empty";
            numberOfPlants=0;
            needsWater=false;
        }else if(plantID==1){
            plantName="tomato";
        }else if(plantID==2){
            plantName="carrot";
        }else if(plantID==3){
            plantName="tulip";
        }else{
            plantName="lettuce";
        }
    }

    public void printPlotInfo(){
        System.out.println("*****Plot Info*****");
        System.out.println("plant: "+plantName);
        System.out.println("amount: "+numberOfPlants);
        System.out.println("thirsty: "+needsWater);

    }
}
