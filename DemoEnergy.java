abstract class EnergySource{
   int source_id;
   String source_name;
   float energy_generated;
   
   abstract void calc_efficiency();
   
   void display(){
      System.out.println("Source ID = " + source_id);
      System.out.println("Source Name = " + source_name);
      System.out.println("Energy Generated in kWh = " + energy_generated);
   }
   
}

public class DemoEnergy{
   public static void main(String agrs[]){
      EnergySource e1 = new SolarEnergy(123, "Hybrid", 500);
      EnergySource e2 = new WindEnergy(123, "Standard", 500);
      e1.display();
      e1.calc_efficiency();
      e2.display();
      e2.calc_efficiency();
   }
}

class SolarEnergy extends EnergySource{
   SolarEnergy(int sid, String sname, float egen){
      source_id = sid;
      source_name = sname;
      energy_generated = egen;
   }
   
   void calc_efficiency(){
      float eff = (energy_generated / 5000) * 100;
      System.out.println("Efficiency Percentage = " + eff);
   }
}

class WindEnergy extends EnergySource{
   WindEnergy(int sid, String sname, float egen){
      source_id = sid;
      source_name = sname;
      energy_generated = egen;
   }
   
   void calc_efficiency(){
      float eff = (energy_generated / 8000) * 100;
      System.out.println("Efficiency Percentage = " + eff);
   }
}

