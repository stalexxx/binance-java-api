package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Order or trade report update event.
 * <p>
 * This event is embedded as part of a user data update event.
 *
 * @see UserDataUpdateEvent
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListUpdateEvent {

  @JsonProperty("e")
  private String eventType;

  @JsonProperty("E")
  private Long eventTime;

  @JsonProperty("s")
  private String symbol;

  @JsonProperty("g")
  private String orderListId;

  @JsonProperty("c")
  private ContingencyType contingencyType;

  /**
   * List Status Type
   */
  @JsonProperty("l")
  private OCOStatus listStatus;

  /**
   * List Order Status
   */
  @JsonProperty("L")
  private OCOOrderStatus listOrderStatus;


  @JsonProperty("C")
  private String listClientOrderId;

  /**
   * Buy/Sell order side.
   */
  @JsonProperty("S")
  private OrderSide side;


  /**
   * Reason why the order was rejected.
   */
  @JsonProperty("r")
  private OrderRejectReason orderRejectReason;

  /**
   * Order id.
   */
  @JsonProperty("i")
  private Long orderId;


  /**
   * Transaction Time
   */
  @JsonProperty("T")
  private Long transactionTime;

  /**
   * Trade id.
   */
  @JsonProperty("t")
  private Long tradeId;

  /**
   * Order creation time.
   */
  @JsonProperty("O")
  private Long orderCreationTime;


  private List<ListItem> listItems;

  /**
   * Quote Order Qty.
   */
  @JsonProperty("Q")
  private String quoteOrderQty;

  public String getOrderListId() {
    return orderListId;
  }

  public void setOrderListId(String orderListId) {
    this.orderListId = orderListId;
  }

  public ContingencyType getContingencyType() {
    return contingencyType;
  }

  public void setContingencyType(ContingencyType contingencyType) {
    this.contingencyType = contingencyType;
  }

  public OCOStatus getListStatus() {
    return listStatus;
  }

  public void setListStatus(OCOStatus listStatus) {
    this.listStatus = listStatus;
  }

  public OCOOrderStatus getListOrderStatus() {
    return listOrderStatus;
  }

  public void setListOrderStatus(OCOOrderStatus listOrderStatus) {
    this.listOrderStatus = listOrderStatus;
  }

  public String getListClientOrderId() {
    return listClientOrderId;
  }

  public void setListClientOrderId(String listClientOrderId) {
    this.listClientOrderId = listClientOrderId;
  }

  public OrderRejectReason getOrderRejectReason() {
    return orderRejectReason;
  }

  public void setOrderRejectReason(OrderRejectReason orderRejectReason) {
    this.orderRejectReason = orderRejectReason;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Long getEventTime() {
    return eventTime;
  }

  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public OrderSide getSide() {
    return side;
  }

  public void setSide(OrderSide side) {
    this.side = side;
  }


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public Long getTransactionTime() {
    return transactionTime;
  }

  public void setTransactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
  }

  public Long getTradeId() {
    return tradeId;
  }

  public void setTradeId(Long tradeId) {
    this.tradeId = tradeId;
  }

  public Long getOrderCreationTime() {
    return orderCreationTime;
  }

  public void setOrderCreationTime(Long orderCreationTime) {
    this.orderCreationTime = orderCreationTime;
  }

  public List<ListItem> getListItems() {
    return listItems;
  }

  public void setListItems(List<ListItem> listItems) {
    this.listItems = listItems;
  }

  public String getQuoteOrderQty() {
    return quoteOrderQty;
  }

  public void setQuoteOrderQty(String quoteOrderQty) {
    this.quoteOrderQty = quoteOrderQty;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime)
        .append("symbol", symbol)
        .append("orderListId", orderListId)
        .append("side", side)
        .append("orderRejectReason", orderRejectReason)
        .append("orderId", orderId)
        .append("orderTradeTime", transactionTime)
        .append("tradeId", tradeId)
        .append("orderCreationTime", orderCreationTime)
        .append("quoteOrderQty", quoteOrderQty)
        .toString();
  }


}
