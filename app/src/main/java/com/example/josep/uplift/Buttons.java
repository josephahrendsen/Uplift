        import java.util.Random;
        public class Buttons extends Data {
            public Buttons()
            {
            }
            //program reroll
            //program continue to continue to the next page
            //program option 1-9 to run

            int min=1;
            int max=184;
            Random r = new  Random(); //exclusive
            int randInt=r.nextInt(184)+1;//random int between 1 and 184
             
//need to set the first 9 options b/4 they get changed based on users intrests
        
            public String get_outdoors()
         {
             int randOutdoors=r.nextInt(outdoors.length)+1;
             return outdoors[randOutdoors];
         }
        public String get_indoors()
        {
            int randIndoors=r.nextInt(indoors.length)+1;
            return indoors[randIndoors];
        }
        public String get_creating()
        {
            int randCreating=r.nextInt(creating.length)+1;
            return creating[randCreating];
        }
        public String get_sound()
        {
            int randSound=r.nextInt(sound.length)+1;
            return sound[randSound];
        }
        public String get_sight()
        {
            int randSight=r.nextInt(sight.length)+1;
            return sight[randSight];
        }
        public String get_feel()
        {
            int randFeel=r.nextInt(feel.length)+1;
            return feel[randFeel];
        }
        public String get_memory()
        {
            int randMemory=r.nextInt(memory.length)+1;
            return memory[randMemory];
        }
        public String get_productivity()
        {
            int randProductivity=r.nextInt(productivity.length)+1;
            return productivity[randProductivity];
        }
        public String get_consumption()
        {
            int randConsumption=r.nextInt(consumption.length)+1;
            return consumption[randConsumption];
        }
        public String get_personalTime()
        {
            int randPersonalTime=r.nextInt(personal_time.length)+1;
            return personal_time[randPersonalTime];
        }
        public String get_socializing()
        {
            int randSocializing=r.nextInt(socializing.length)+1;
            return socializing[randSocializing];
        }
        public String get_small_activities()
        {
            int randSmallActivities=r.nextInt(small_activities.length)+1;
            return small_activities[randSmallActivities];
        }
        public String get_sexual()
        {
            int randSexual=r.nextInt(sexual.length)+1;
            return sexual[randSexual];
        }
        public String get_online()
        {
            int randOnline=r.nextInt(online.length)+1;
            return online[randOnline];
        }
        public String get_leaving_comfort_zone()
        {
            int randLeavingComfortZone=r.nextInt(leaving_comfort_zone.length)+1;
            return leaving_comfort_zone[randLeavingComfortZone];
        }
        public String get_animal()
        {
            int randAnimal=r.nextInt(animal.length)+1;
            return animal[randAnimal];
        }
        
            public void reRoll() //need to also find a random value thats assigned to a catagory of the users preffered catagories arraylist?
            {
             this.optionOne();
             this.optionTwo();
             this.optionThree();
             this.optionFour();
             this.optionFive();
             this.optionSix();
             this.optionSeven();
             this.optionEight();
             this.optionNince();
            }
            public String get_random_catorgory()
            {
                int randCatagory=r.nextint();
            }
            //first 3 options can be values 4.0+ (if applicable)
            //next 3 options >can< be values 3.0+ (if applicable)
            //next 3 options >can< be values 2.0+ (if applicable)
            //i want to make an array with the catagories and what their value is (1-5)
            //then you can make a another random to find which catagory to use
                public void optionOne()
                {
                    
                    if(value<name>4)
                    {
                        this.get_<name>(); //calls the random activity from <name>
                    }
                }
                public void optionTwo()
                {

                }
                public void optionThree()
                {

                }
                public void optionFour()
                {

                }
                public void optionFive()
                {

                }
                public void optionSix()
                {

                }
                public void optionSeven()
                {

                }
                public void optionEight()
                {

                }
                public void optionNince()
                {

                }
                
            }