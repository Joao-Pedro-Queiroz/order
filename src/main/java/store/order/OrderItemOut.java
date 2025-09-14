package store.order;

import lombok.Builder;

@Builder
public record OrderItemOut(
  String id,
  ProductRefOut product,
  Integer quantity,
  Double total
) {
    
}