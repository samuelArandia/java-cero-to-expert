package clases;

public class Lasagna {

        // TODO: define the 'expectedMinutesInOven()' method
        public int expectedMinutesInOven() {
            int min = 40;
            return min;
        }

        // TODO: define the 'remainingMinutesInOven()' method
        public int remainingMinutesInOven(int minutesElapsed){
            int expectedMinutes = expectedMinutesInOven();
            return expectedMinutes - minutesElapsed;
        }

        // TODO: define the 'preparationTimeInMinutes()' method
        public int preparationTimeInMinutes(int layers) {
            int minutesPerLayer = 2;
            return layers * minutesPerLayer;
        }

        // TODO: define the 'totalTimeInMinutes()' method
        public int totalTimeInMinutes(int layers,  int minutesElapsed) {
            int preparetionTime = preparationTimeInMinutes(layers );
            int remainingTime= remainingMinutesInOven(minutesElapsed );
            return preparetionTime + remainingTime;
        }
    }
