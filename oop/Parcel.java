package oop;

public class Parcel {
    private String from;
    private String to;
    private String itemType;
    private String itemStatus;
    private long contact;
    public Parcel() {
    }
    public Parcel(String from, String to, String itemType, String itemStatus, long contact) {
        this.from = from;
        this.to = to;
        this.itemType = itemType;
        this.itemStatus = itemStatus;
        this.contact = contact;
    }
    // setter for from
    public void setFrom(String from){
        this.from = from;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }
    // total reading
    @Override
    public String toString() {
        return "Parcel [from=" + from + ", to=" + to + ", itemType=" + itemType + ", itemStatus=" + itemStatus
                + ", contact=" + contact + "]";
    }
    public long getContact(){
        return contact;
    }
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }
    public String getItemType() {
        return itemType;
    }
    public String getItemStatus() {
        return itemStatus;
    }
}

class Execution{
    public static void main(String[] args) {
        Parcel parcel1= new Parcel("razak mohamed","vinayak","card","shipped",98765678765L);
        Parcel parcel2 = new Parcel();
        parcel2.setFrom("mohamed");
        parcel2.setTo("vikas");
        parcel2.setItemStatus("delivery");
        parcel2.setItemType("glass");
        parcel2.setContact(89765456786L);
        System.out.println(parcel2);
        System.out.println(parcel1.getItemStatus());

    }
}