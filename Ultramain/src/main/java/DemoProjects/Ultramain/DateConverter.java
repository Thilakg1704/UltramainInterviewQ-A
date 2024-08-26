package DemoProjects.Ultramain;

public class DateConverter {
    public static void main(String[] args) {
        String date = "13 Feb 2018";
        
        // Split the date string into day, month, and year
        String[] dateParts = date.split(" ");
        String day = dateParts[0];
        String month = dateParts[1];
        String year = dateParts[2];

        // Convert the month from text to number
        String monthNumber = convertMonthToNumber(month);

        // Format the new date string in dd-MM-yyyy format
        String newDate = day + "-" + monthNumber + "-" + year;
        System.out.println(newDate);
    }

    // Method to convert month name to month number
    private static String convertMonthToNumber(String month) {
        switch(month.toLowerCase()) {
            case "jan": return "01";
            case "feb": return "02";
            case "mar": return "03";
            case "apr": return "04";
            case "may": return "05";
            case "jun": return "06";
            case "jul": return "07";
            case "aug": return "08";
            case "sep": return "09";
            case "oct": return "10";
            case "nov": return "11";
            case "dec": return "12";
            default: throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
}
