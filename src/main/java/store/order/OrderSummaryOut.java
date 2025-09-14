package store.order;

import lombok.Builder;

@Builder
public record OrderSummaryOut(
  String id,
  String date,
  Double total
) {
    
}