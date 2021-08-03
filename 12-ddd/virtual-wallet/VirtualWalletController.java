import java.math.BigDecimal;

public class VirtualWalletController {
    private VirtualWalletService virtualWalletController;

    public BigDecimal getBalance(Long walletId) { ... }

    public void debit(Long walletId) { ... }
    public void credit(Long walletId, BigDecimal amount) { ... }
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) { ... }
}
