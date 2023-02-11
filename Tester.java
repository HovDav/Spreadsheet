public class Tester {
    Cell c = new Cell();
    Spreadsheet sheet1 = new Spreadsheet(4, 3);

    void testToInt() {
        c.setValue("41");
        if (c.toInt() != 41) {
            System.out.println("Test toInt Failed for 41");
        } else {
            System.out.println("Test toInt Passed for 41");
        }
        c.setValue("-41");
        if (c.toInt() != -41) {
            System.out.println("Test toInt Failed for \"-41\"");
        } else {
            System.out.println("Test toInt Passed for \"-41\"");
        }
    }

    void testToDouble() {
        c.setValue("41");
        if (c.toDouble() != 41.00) {
            System.out.println("Test toDouble Failed for 41");
        } else {
            System.out.println("Test toDouble Passed for 41");
        }
        c.setValue("41.45");
        if (c.toDouble() != 41.45) {
            System.out.println("Test toDouble Failed for \"41.45\"");
        } else {
            System.out.println("Test toDouble Passed for \"41.45\"");
        }
        c.setValue("-41.45");
        if (c.toDouble() != -41.45) {
            System.out.println("Test toDouble Failed for \"-41.45\"");
        } else {
            System.out.println("Test toDouble Passed for \"-41.45\"");
        }
    }

    void testToDate() {
        c.setValue("15.01.2022");
        Date d = new Date();
        if (c.toDate() == d) {
            System.out.println("Test toDate passed");
        }
        else {
            System.out.println("Test toDate failed");
        }
    }

    void testReset() {
        c.setValue("aaa");
        c.reset();
        if (c.getValue() == null) {
            System.out.println("Test Reset Passed");
        } else {
            System.out.println("Test Reset Failed");
        }
    }

    void testSetCellAt1() {
        c.setValue("Hello");
        sheet1.setCellAt(0,0, c);
        if (c.getValue() == sheet1.getCellAt(0,0).getValue()) {
            System.out.println ("Test SetCellAt1 and getCellAt passed");
        }
        else {
            System.out.println("Test SetCellAt1 or getCellAt failed");
        }
    }
    void testSetCellAt2() {
        c.setValue("World");
        sheet1.setCellAt(0,0, "World");
        if (c.getValue() == sheet1.getCellAt(0,0).getValue()) {
            System.out.println("Test SetCellAt2 and getCellAt passed");
        }
        else {
            System.out.println("Test SetCellAt2 or getCellAt failed");
        }
    }
    void testAddRowAt() {
        // TODO: 2/7/23

    }
    void testRemoveRow() {
        // TODO: 2/7/23
    }
    void testAddColumnAt() {
        // TODO: 2/7/23
    }
    void testRemoveColumn() {
        // TODO: 2/7/23
    }
    void testSwapRows() {
        // TODO: 2/7/23
    }
    void testSwapColumns() {
        // TODO: 2/7/23
    }
}