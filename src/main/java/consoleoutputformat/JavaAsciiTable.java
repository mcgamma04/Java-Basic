package consoleoutputformat;

import com.bethecoder.ascii_table.ASCIITable;

public class JavaAsciiTable {

        public static void main(String[] args) {
       //To use add the jar files. Create one dimensional array for header and two dimensional array for
       //for the conntent.
            String [] tableHeaders = { "Student Name", "Department", "Level","Gender"};

            String[][] tableData = {
                    { "Adebayo Michael", "Computer Science", "400", "Male"  },
                    { "Ubadinma Blessing", "Elect/Elect", "300", "Female" },
                    { "Adebayo Best ", "Medicine and Surgery", "600", "Female" },
                    { "Ademola Olamide", "Software Engineering", "200", "Male" },

            };

            ASCIITable.getInstance().printTable(tableHeaders, tableData);
        }



}
