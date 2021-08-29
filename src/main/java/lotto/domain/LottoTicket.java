package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoTicket {
    private List<Lotto> lottos;

    public LottoTicket() {
        lottos = new ArrayList<Lotto>();
    }

    public void add(Lotto lotto) {
        lottos.add(lotto);
    }

    public List<Lotto> getLottos() {
        return lottos;
    }
}
