package com.reflection;

public class Client extends Person  implements IClient{
    String groupName;
    Integer loyality;

    public void setName(String name, String groupName) {
         this.setName(name);
         this.groupName=groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setLoyality(Integer loyality) {
        this.loyality = loyality;
    }

    @Deprecated
    public String getGroupName() {

        return groupName;
    }

    public Integer getLoyality() {
        return loyality;
    }

    public Client(String groupName, Integer loyality) {
        this.groupName = groupName;
        this.loyality = loyality;
    }
    private String getFullName() {
        return this.getName()+" "+this.groupName;
    }

}
