package academy.devdojo.maratonajava.javacore.Kenum.model;

public enum ClientType {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int CLIENT_VALUE;
    private String reportName;

    ClientType(int clientValue, String reportName) {
        this.CLIENT_VALUE = clientValue;
        this.reportName = reportName;
    }

    public static ClientType getClientTypeByReportName(String clientReportName) {
        for (ClientType type : values()) {
            if (type.getReportName().equals(clientReportName)) {
                return type;
            }
        }
        return null;
    }

    public int getCLIENT_VALUE() {
        return CLIENT_VALUE;
    }

    public String getReportName() {
        return reportName;
    }
}
