public class Main {

    public static void main(String[] args) {

//        Coding Exercise 1: Speed Converter
//        SpeedConverter.printConversion(1.5); //1.5 km/h = 1 mi/h
//        SpeedConverter.printConversion(10.25); //10.25 km/h = 6 mi/h
//        SpeedConverter.printConversion(-1); //Invalid Value
//        SpeedConverter.printConversion(16); //16.0 km/h = 10 mi/h
//        SpeedConverter.printConversion(47); //47.0 km/h = 29 mi/h
//
//        Coding Exercise 2: MegaBytes Converter
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500); //2500 KB = 2 MB and 452 KB
//
//        Coding Exercise 3: Barking Dog
//        System.out.println(BarkingDog.shouldWakeUp (true, 1)); // true
//        System.out.println(BarkingDog.shouldWakeUp (false, 2)); // false
//        System.out.println(BarkingDog.shouldWakeUp (true, 8)); // false
//        System.out.println(BarkingDog.shouldWakeUp (true, -1)); // false
//
//        Coding Exercise 4
//        LeapYear.isLeapYear(-1600); //False
//        LeapYear.isLeapYear(1600); //True
//        LeapYear.isLeapYear(2017); //False
//        LeapYear.isLeapYear(2000); //True
//
//        Coding Exercise 5
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //True
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176)); //False
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0)); //True
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123)); //False
//
//        Coding Exercise 6
//        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1)); //false
//        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2)); //true
//        System.out.println(EqualSumChecker.hasEqualSum(-1, 1, 0)); //true
//
//        Coding Exercise 7
//        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19)); //true
//        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42)); //true
//        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34)); //false
//        System.out.println(TeenNumberChecker.isTeen(9)); //false
//        System.out.println(TeenNumberChecker.isTeen(13)); //true
//
//        Coding Exercise: Seconds and Minutes
//        System.out.println(SecondsAndMinutes.getDurationString(66, 54)); // 1h 6m 54s
//        System.out.println(SecondsAndMinutes.getDurationString(0, 54)); // 0h 0m 54s
//        System.out.println(SecondsAndMinutes.getDurationString(142, 54)); // 2h 22m 54s
//        System.out.println(SecondsAndMinutes.getDurationString(-1, 54)); // invalid value
//        System.out.println(SecondsAndMinutes.getDurationString(66, -54)); // invalid value
//        System.out.println(SecondsAndMinutes.getDurationString(66, 94)); // invalid value
//        System.out.println(SecondsAndMinutes.getDurationString(66, 3)); // 01h 06m 09s
//
//        System.out.println(SecondsAndMinutes.getDurationString(142)); // 0h 2m 22s
//        System.out.println(SecondsAndMinutes.getDurationString(-50)); // invalid value
//        System.out.println(SecondsAndMinutes.getDurationString(982)); // 0h 16m 22s
//        System.out.println(SecondsAndMinutes.getDurationString(245)); // 0h 3m 25s
//        System.out.println(SecondsAndMinutes.getDurationString(65)); // 00h 01m 05s

//        Coding Exercise 8
//        System.out.println(AreaCalculator.area(5.0)); //should return 78.53975
//        System.out.println(AreaCalculator.area(-1));  //should return -1 since the parameter is negative
//        System.out.println(AreaCalculator.area(5.0, 4.0)); //should return 20.0 (5 * 4 = 20)
//        System.out.println(AreaCalculator.area(-1.0, 4.0));  //should return -1 since first the parameter is negative

//        Coding Exercise 9
//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);  //??? should print "525600 min = 1 y and 0 d"
//        MinutesToYearsDaysCalculator.printYearsAndDays(1051200); //??? should print "1051200 min = 2 y and 0 d"
//        MinutesToYearsDaysCalculator.printYearsAndDays(561600);  //??? should print "561600 min = 1 y and 25 d"

//        Coding Exercise 10
//        IntEqualityPrinter.printEqual(1, 1, 1); //should print text All numbers are equal
//        IntEqualityPrinter.printEqual(1, 1, 2); //should print text Neither all are equal or different
//        IntEqualityPrinter.printEqual(-1, -1, -1); //should print text Invalid Value
//        IntEqualityPrinter.printEqual(1, 2, 3); //should print text All numbers are different

//        Coding Exercise 11
        System.out.println(PlayingCat.isCatPlaying(true, 10)); //should return false since temperature
        // is not in range 25 - 45
        System.out.println(PlayingCat.isCatPlaying(false, 36)); //should return false since
        // temperature is not in range 25 - 35 (summer parameter is false)
        System.out.println(PlayingCat.isCatPlaying(false, 35)); //should return true since temperature
        // is in range 25 - 35
    }
}
