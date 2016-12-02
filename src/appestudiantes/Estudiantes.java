
package appestudiantes;


public class Estudiantes {
   public double prom;
   public double dscto;
   public int cred;
   public int P;
   public int vcredpre;
   public int vcredpos;
   public double vtotal;
   
   
   /*Camilo hizo esto*/
   public void Pagar()
   {
       if(P == 1)
       {
            if(prom>=4.5)
            {
                cred = 28;
                dscto = 25;
                vtotal = vcredpre*cred;
                vtotal = vtotal - (vtotal*0.25);
            }   
            else
                if (prom>=4.0)
                {
                    cred = 25;
                    dscto = 10;
                    vtotal =  vcredpre*cred;
                    vtotal = vtotal - (vtotal*0.1);
                }
                else
                    if(prom>=3.5)
                    {
                         cred = 20;
                         dscto =  0;
                         vtotal = vcredpre*cred;
                    }
                    else 
                        if(prom>=2.5)
                        {
                            cred = 15;
                            dscto =  0;
                            vtotal = vcredpre*cred;
                        }
                        else
                        {
                            vtotal=0;
                        }
        }
        if (P==2)
        {
            if (prom>=4.5) 
            {
                cred = 20;
                dscto = 20;
                vtotal =  vcredpos*cred;
                vtotal = vtotal - (vtotal*0.2);
            }
               else 
                    {
                        cred = 10;
                        dscto = 0;
                        vtotal = vcredpos*cred;
                    }
       }
   }
}
