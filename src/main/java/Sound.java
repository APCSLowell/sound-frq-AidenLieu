 import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    int a = 0; 
    for(int i = 0; i < sample.length; i++){
      if(sample[i] > limit || sample[i] < -1 * limit){
        a++
      }
    }
    return a;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    int zero = 0;
    boolean num = false;
    for(int i = 0; i < sample.length; i++){
      if(sample[i] == 0 && num == false){
        zero++
      }else{
        num = true;
      }
    }
    int[] b = new int[sample.length-zero];
     for(int i = 0; i < sample.length; i++){
       b[i - zero] = sample[i];
     }
    sample = b;
  }
}
