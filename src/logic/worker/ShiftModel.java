package logic.worker;

import java.util.List;

public class ShiftModel {
    private boolean isNightShift;
    private int shiftManagerID;
    private List<Integer> cashiersID;
    private List<Integer> storeKeepersID;

    public void setShiftTime(boolean shiftTime) {
        this.isNightShift = shiftTime;
    }

    public boolean getShiftTime() {
        return this.isNightShift;
    }

    public void setShiftManager(int workerID) {
        this.shiftManagerID = workerID;
    }

    public int getShiftManagerID() {
        return this.shiftManagerID;
    }

    public void addCashierID(int workerID) {
        cashiersID.add(workerID);
    }

    public List<Integer> getCashiersID() {
        return cashiersID;
    }

    public void addStoreKeeperID(int workerID) {
        storeKeepersID.add(workerID);
    }

    public List<Integer> getStoreKeepersID() {
        return storeKeepersID;
    }
}
