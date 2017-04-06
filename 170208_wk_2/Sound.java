/* compute distance to lightening
  - assume the lightening time interval: 7.2
  - speed of sound in feet: 1,100 per second through air
  - compute distance: multiply 7.2 x 1,100
*/


class Sound
{
    public static void main(String[] args)
    {
        double lightening_time_interval = 7.2, sound_in_feet = 1100;
        double dist = lightening_time_interval * sound_in_feet;
        System.out.println("The lightening is " + dist + " feet away.");

        double echo_time_interval = 7.2;
        double dist_echo = (echo_time_interval * sound_in_feet)/2;
        System.out.println("The large object is " + dist_echo + " feet away.");
    }
}

// questions on pages: 40, 49, 59 (eg byte vs integer)