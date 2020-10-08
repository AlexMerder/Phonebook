import java.util.Objects;

public class Account {

    private final int contactId;
    private final String type;
    private final String protocol;
    private final String address;
    private String accountName;

    public Account(int contactId, String type, String protocol, String address, String accountName) {
        this.contactId = contactId;
        this.type = type;
        this.protocol = protocol;
        this.address = address;
        this.accountName = accountName;
    }

    public int getContactId() {
        return contactId;
    }

    public String getType() {
        return type;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return contactId == account1.contactId &&
                Objects.equals(type, account1.type) &&
                Objects.equals(protocol, account1.protocol) &&
                Objects.equals(address, account1.address) &&
                Objects.equals(accountName, account1.accountName);
    }

    @Override
    public String toString() {
        return accountName;
    }

}