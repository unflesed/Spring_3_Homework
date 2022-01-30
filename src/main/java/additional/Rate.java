package additional;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Rate {
    private String r030;
    @SerializedName("txt")
    private String name;
    private BigDecimal rate;
    @SerializedName("cc")
    private String currency;
    @SerializedName("exchangedate")
    private String exchangeDate;
}
