package org.broadleafcommerce.payment.service.module;

import org.broadleafcommerce.order.domain.PaymentInfo;
import org.broadleafcommerce.payment.service.exception.PaymentException;
import org.broadleafcommerce.payment.service.exception.PaymentProcessorException;

public interface GiftCardModule {

    public String getName();

    public void setName(String name);

    public GiftCardResponse authorize(PaymentInfo paymentInfo) throws PaymentException, PaymentProcessorException;

    public GiftCardResponse debit(PaymentInfo paymentInfo) throws PaymentException, PaymentProcessorException;

    public GiftCardResponse authorizeAndDebit(PaymentInfo paymentInfo) throws PaymentException, PaymentProcessorException;

    public GiftCardResponse credit(PaymentInfo paymentInfo) throws PaymentException, PaymentProcessorException;

    public GiftCardResponse voidPayment(PaymentInfo paymentInfo) throws PaymentException, PaymentProcessorException;

    public GiftCardResponse balance(PaymentInfo paymentInfo) throws PaymentException, PaymentProcessorException;

}
