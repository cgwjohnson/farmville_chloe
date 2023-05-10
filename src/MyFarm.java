import java.util.ArrayList;

public class MyFarm {

    ArrayList<Plot> row;

    public static void main(String[] args) {
       MyFarm farm = new MyFarm();
    }

    public MyFarm(){
        row=new ArrayList<>();
        for(int i=0; i<10; i++){
            row.add(new Plot());
        }
//        for(int x=0; x<row.size(); x++){
//            row.get(x).printPlotInfo();   //row.get(x) is a singular object
//
//        }
        totalPlants();
//        printPlantNames();
        printRowInfo();
//        totalCarrots();
//        averageNumberOfPlants();
//        numberOfCarrotPlots();
//        numberOfEmptyPlots();
//        addLettuce();
//        addTulip();
//        tomatoLocations();
//        everyOtherNeedsWater();
//        plantWithMaxNumber();
//        plantWithMinNumber();
//        greaterThan10();
//        plantWithMaxNumberNeedsWater();
//        greatestDifferenceNumberBetweenAnyPlants();
//        numberOfCarrotPlotsNextToLettuce();
        greatestDifferenceOfPlantNumbers();
//        removeFirstCarrot();
//        removeAllEmpty();
    }//MyFarm()


    public void totalPlants() {
        // how many total plants are there in the row?
        System.out.println("***Total Plants***");
        int total=0;
        for(int t=0; t< row.size(); t++){
            total=total+row.get(t).numberOfPlants;
        }
        System.out.println("total plants: "+total);

    }
    public void printPlantNames() {
        // print the name of each plant in the row and its index
        System.out.println("***Plant Names***");
        System.out.print("plants: ");
        for(int t=0; t< row.size(); t++){
            System.out.print(row.get(t).plantName+", ");
        }
        System.out.println();
    }

    public void printRowInfo() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        System.out.println("*****Row Info*****");
        for(int x=0; x<row.size(); x++){
            row.get(x).printPlotInfo();   //row.get(x) is a singular object

        }
    }

    public void addLettuce() {
        // add a lettuce plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        System.out.println("*****Add Lettuce*****");
        row.add(new Plot());
        row.get(row.size()-1).plantName="lettuce";
        row.get(row.size()-1).numberOfPlants=42;
        row.get(row.size()-1).needsWater=true;
        printPlantNames();

    }

    public void addTulip() {
        // at index 3, add a new tulip plot with 70 plants that do not need water
        // call printPlantNames() method before and after your addition to make sure it worked
        System.out.println("*****Add Tulip*****");
        row.add(new Plot());
        row.get(3).plantName="lettuce";
        row.get(3).numberOfPlants=42;
        row.get(3).needsWater=true;
        printPlantNames();

    }

    public void tomatoLocations() {
        // print indexes of all tomato plants
        System.out.println("*****Tomato Indexes*****");
        System.out.print("There are tomatoes in the following plots: ");
        for(int y=0; y<row.size();y++){
            if(row.get(y).plantName.equals("tomato")){
                System.out.print(y+", ");
            }
        }
        System.out.println();

    }

    public void totalCarrots() {
        // how many total carrot plants are there?
        System.out.println("***Total Carrots***");
        int total=0;
        for(int t=0; t< row.size(); t++){
            if(row.get(t).plantName=="carrot") {
                total = total + row.get(t).numberOfPlants;
            }
        }
        System.out.println("total carrots: "+total);

    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        System.out.println("***Average Plants***");
        int total=0;
        for(int t=0; t< row.size(); t++){
            total=total+row.get(t).numberOfPlants;
        }
        System.out.println("average of plants: "+total/row.size());
    }

    public void numberOfCarrotPlots() {
        // how many plots have carrots on them
        int total=0;
        System.out.println("***Carrot Plots***");
        for(int a=0; a< row.size(); a++){
            if(row.get(a).plantName=="carrot"){
                total=total+1;
            }
        }
        System.out.println("There are "+ total +" carrot plots");

    }

    public void numberOfEmptyPlots() {
        // how many plots are empty
        int total=0;
        System.out.println("***Empty Plots***");
        for(int a=0; a< row.size(); a++){
            if(row.get(a).plantName=="empty"){
                total=total+1;
            }
        }
        System.out.println("There are "+ total +" empty plots");

    }

    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        System.out.println("*****Needs Water Alternate*****");
        for(int x=0; x<row.size(); x=x+2){
            row.get(x).needsWater=true;
        }
        for(int x=0; x<row.size(); x++){
            System.out.print(row.get(x).needsWater+", ");
        }
        System.out.println();
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        System.out.println("***Plant with Max Number***");
        int totalCarrots=0;
        int totalTomatoes=0;
        int totalLettuce=0;
        int totalTulips=0;
        for(int x=0; x<row.size(); x++){
            if(row.get(x).plantName=="carrot"){
                totalCarrots=totalCarrots+row.get(x).numberOfPlants;
            }else if(row.get(x).plantName=="tomato"){
                totalTomatoes=totalTomatoes+row.get(x).numberOfPlants;
            }else if(row.get(x).plantName=="lettuce"){
                totalLettuce=totalLettuce+row.get(x).numberOfPlants;
            }else if(row.get(x).plantName=="tulip"){
                totalTulips=totalTulips+row.get(x).numberOfPlants;
            }
            else{
                //empty
            }
        }
        String maxPlantType="max";
        int currentMax=0;
        if(totalCarrots<totalTomatoes &&totalCarrots>0){
            currentMax=totalTomatoes;
            maxPlantType="tomatoes";
        }else if(totalTomatoes<totalCarrots &&totalTomatoes>0){
            currentMax=totalCarrots;
            maxPlantType="carrots";
        }
        if(totalLettuce>currentMax &&totalLettuce>0){
            currentMax=totalLettuce;
            maxPlantType="lettuce";
        }
        if(totalTulips>currentMax&&totalTulips>0){
            currentMax=totalTulips;
            maxPlantType="tulips";
        }
        System.out.println(maxPlantType+" has the most total plants. It has "+currentMax);
    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
        System.out.println("***Plant with Min Number***");
        int totalCarrots=0;
        int totalTomatoes=0;
        int totalLettuce=0;
        int totalTulips=0;
        for(int x=0; x<row.size(); x++){
            if(row.get(x).plantName=="carrot"){
               totalCarrots=totalCarrots+row.get(x).numberOfPlants;
            }else if(row.get(x).plantName=="tomato"){
                totalTomatoes=totalTomatoes+row.get(x).numberOfPlants;
            }else if(row.get(x).plantName=="lettuce"){
                totalLettuce=totalLettuce+row.get(x).numberOfPlants;
            }else if(row.get(x).plantName=="tulip"){
                totalTulips=totalTulips+row.get(x).numberOfPlants;
            }
            else{
                //empty
            }
        }
        String minPlantType="min";
        int currentMin=0;
        if(totalCarrots<totalTomatoes &&totalCarrots>0){
            currentMin=totalCarrots;
            minPlantType="carrots";
        }else if(totalTomatoes<totalCarrots &&totalTomatoes>0){
            currentMin=totalTomatoes;
            minPlantType="tomatoes";
        }
        if(totalLettuce<currentMin &&totalLettuce>0){
            currentMin=totalLettuce;
            minPlantType="lettuce";
        }
        if(totalTulips<currentMin&&totalTulips>0){
            currentMin=totalTulips;
            minPlantType="tulips";
        }
        System.out.println(minPlantType+" has the least total plants. It only has "+currentMin);

    }

    public void greaterThan10() {
        // how many plots have more than 10 plants in the plot?
        System.out.println("***More Than 10***");
        System.out.print("These plots have more than 10 plants: ");
        for(int x=0; x<row.size(); x++){
            if(row.get(x).numberOfPlants>10){
                System.out.print(x+", ");
            }
        }

    }

    public void plantWithMaxNumberNeedsWater(){
        // which plant type has the most total plants (not counting empty plots) that needs water?
        System.out.println("***Plant with Max Number Needs Water***");
        int totalCarrots=0;
        int totalTomatoes=0;
        int totalLettuce=0;
        int totalTulips=0;
        for(int x=0; x<row.size(); x++){
            if(row.get(x).plantName=="carrot"&&row.get(x).needsWater==true){
                totalCarrots=totalCarrots+row.get(x).numberOfPlants;
            }else if(row.get(x).plantName=="tomato"&&row.get(x).needsWater==true){
                totalTomatoes=totalTomatoes+row.get(x).numberOfPlants;
            }else if(row.get(x).plantName=="lettuce"&&row.get(x).needsWater==true){
                totalLettuce=totalLettuce+row.get(x).numberOfPlants;
            }else if(row.get(x).plantName=="tulip"&&row.get(x).needsWater==true){
                totalTulips=totalTulips+row.get(x).numberOfPlants;
            }
            else{
                //empty
            }
        }
        String maxPlantType="max";
        int currentMax=0;
        if(totalCarrots<totalTomatoes &&totalCarrots>0){
            currentMax=totalTomatoes;
            maxPlantType="tomatoes";
        }else if(totalTomatoes<totalCarrots &&totalTomatoes>0){
            currentMax=totalCarrots;
            maxPlantType="carrots";
        }
        if(totalLettuce>currentMax &&totalLettuce>0){
            currentMax=totalLettuce;
            maxPlantType="lettuce";
        }
        if(totalTulips>currentMax&&totalTulips>0){
            currentMax=totalTulips;
            maxPlantType="tulips";
        }
        System.out.println(maxPlantType+" has the most total plants that need water. It has "+currentMax);
    }

    public void greatestDifferenceNumberBetweenAnyPlants() {
        // of every pair of adjacent plots, which two have the greatest difference in plant numbers?
        // what is that difference?

        System.out.println("***Plots with Greatest Difference***");
        int greatestDif=0;
        String great1="great1";
        String great2="great2";
        for(int x=0; x<row.size(); x++){
            for(int y=0; y< row.size(); y++){
                if(x!=y&&x-1==y&&row.get(x).numberOfPlants>row.get(y).numberOfPlants){
                    if(row.get(x).numberOfPlants-row.get(y).numberOfPlants>greatestDif){
                        greatestDif=row.get(x).numberOfPlants-row.get(y).numberOfPlants;
                        great1=row.get(x).plantName;
                        great2=row.get(y).plantName;
                    }
                }else if(x!=y&&x-1==y&&row.get(x).numberOfPlants<row.get(y).numberOfPlants){
                    if(row.get(y).numberOfPlants-row.get(x).numberOfPlants>greatestDif){
                        greatestDif=row.get(y).numberOfPlants-row.get(x).numberOfPlants;
                        great1=row.get(x).plantName;
                        great2=row.get(y).plantName;
                    }
                }
            }
        }
        System.out.println(great1+" and "+great2+" have the greatest difference. Their difference is "+greatestDif);
    }

    public void numberOfCarrotPlotsNextToLettuce() {
        // how many carrot plots share a border with a lettuce plot?
        System.out.println("***Carrots Next to Lettuce***");
        int total=0;
        for(int x=1; x<row.size()-1; x++){
            if(row.get(x).plantName=="carrot"&&row.get(x+1).plantName=="lettuce"){
                total=total+1;
            }
            if(row.get(x).plantName=="lettuce"&&row.get(x+1).plantName=="carrot"){
                total=total+1;
            }
        }
        System.out.println("There are "+total+" carrot plots next to lettuce plots");
    }

    public void removeFirstCarrot() {
        // remove the first carrot plot
        // call printPlantNames() method before and after your removal to make sure it worked
        boolean isSecond=false;
        System.out.println("*****Remove Carrot*****");
        printPlantNames();
        for(int x=0; x<row.size(); x++){
           if(row.get(x).plantName == "carrot" && isSecond == false){
            row.remove(x);
            isSecond=true;
           }
        }
        printPlantNames();
    }

    public void removeAllEmpty() {
        // remove all empty plots
        // call printPlantNames() method before and after your removal to make sure it worked
        System.out.println("*****Remove Empty*****");
        printPlantNames();
        System.out.println();
        for(int x=0; x<row.size(); x++){
            if(row.get(x).plantName.equals("empty")){
                row.remove(x);
            }
        }
        printPlantNames();
        System.out.println();
    }

    public void greatestDifferenceOfPlantNumbers() {
        // what is the largest difference in plant numbers between two plants of the same type?
        System.out.println("***Same Plant with Greatest Difference***");
        int greatestDif=0;
        int great1=0;
        int great2=0;
        String plant="greatPlant";
        for(int x=0; x<row.size(); x++){
            for(int y=0; y< row.size(); y++){
                if(x!=y&&row.get(x).numberOfPlants>row.get(y).numberOfPlants&&row.get(x).plantName==row.get(y).plantName){
                    if(row.get(x).numberOfPlants-row.get(y).numberOfPlants>greatestDif){
                        greatestDif=row.get(x).numberOfPlants-row.get(y).numberOfPlants;
                        great1=x;
                        great2=y;
                        plant=row.get(x).plantName;

                    }
                }else if(x!=y&&row.get(x).numberOfPlants<row.get(y).numberOfPlants&&row.get(x).plantName==row.get(y).plantName){
                    if(row.get(y).numberOfPlants-row.get(x).numberOfPlants>greatestDif){
                        greatestDif=row.get(y).numberOfPlants-row.get(x).numberOfPlants;
                        great1=x;
                        great2=y;
                        plant=row.get(x).plantName;
                    }
                }
            }
        }
        System.out.println("Plot "+great1+" and plot "+great2+" are "+plant+" have the greatest difference. Their difference is "+greatestDif);
    }



}
