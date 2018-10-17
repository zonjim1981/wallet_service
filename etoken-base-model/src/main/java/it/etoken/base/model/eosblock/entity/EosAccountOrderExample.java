package it.etoken.base.model.eosblock.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EosAccountOrderExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public EosAccountOrderExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andOrderNoIsNull() {
			addCriterion("order_no is null");
			return (Criteria) this;
		}

		public Criteria andOrderNoIsNotNull() {
			addCriterion("order_no is not null");
			return (Criteria) this;
		}

		public Criteria andOrderNoEqualTo(String value) {
			addCriterion("order_no =", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotEqualTo(String value) {
			addCriterion("order_no <>", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoGreaterThan(String value) {
			addCriterion("order_no >", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
			addCriterion("order_no >=", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLessThan(String value) {
			addCriterion("order_no <", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLessThanOrEqualTo(String value) {
			addCriterion("order_no <=", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLike(String value) {
			addCriterion("order_no like", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotLike(String value) {
			addCriterion("order_no not like", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoIn(List<String> values) {
			addCriterion("order_no in", values, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotIn(List<String> values) {
			addCriterion("order_no not in", values, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoBetween(String value1, String value2) {
			addCriterion("order_no between", value1, value2, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotBetween(String value1, String value2) {
			addCriterion("order_no not between", value1, value2, "orderNo");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andAmountIsNull() {
			addCriterion("amount is null");
			return (Criteria) this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("amount is not null");
			return (Criteria) this;
		}

		public Criteria andAmountEqualTo(BigDecimal value) {
			addCriterion("amount =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(BigDecimal value) {
			addCriterion("amount <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(BigDecimal value) {
			addCriterion("amount >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("amount >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(BigDecimal value) {
			addCriterion("amount <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("amount <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<BigDecimal> values) {
			addCriterion("amount in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<BigDecimal> values) {
			addCriterion("amount not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("amount between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("amount not between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAccountNameIsNull() {
			addCriterion("account_name is null");
			return (Criteria) this;
		}

		public Criteria andAccountNameIsNotNull() {
			addCriterion("account_name is not null");
			return (Criteria) this;
		}

		public Criteria andAccountNameEqualTo(String value) {
			addCriterion("account_name =", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameNotEqualTo(String value) {
			addCriterion("account_name <>", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameGreaterThan(String value) {
			addCriterion("account_name >", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
			addCriterion("account_name >=", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameLessThan(String value) {
			addCriterion("account_name <", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameLessThanOrEqualTo(String value) {
			addCriterion("account_name <=", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameLike(String value) {
			addCriterion("account_name like", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameNotLike(String value) {
			addCriterion("account_name not like", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameIn(List<String> values) {
			addCriterion("account_name in", values, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameNotIn(List<String> values) {
			addCriterion("account_name not in", values, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameBetween(String value1, String value2) {
			addCriterion("account_name between", value1, value2, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameNotBetween(String value1, String value2) {
			addCriterion("account_name not between", value1, value2, "accountName");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyIsNull() {
			addCriterion("owner_public_key is null");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyIsNotNull() {
			addCriterion("owner_public_key is not null");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyEqualTo(String value) {
			addCriterion("owner_public_key =", value, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyNotEqualTo(String value) {
			addCriterion("owner_public_key <>", value, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyGreaterThan(String value) {
			addCriterion("owner_public_key >", value, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyGreaterThanOrEqualTo(String value) {
			addCriterion("owner_public_key >=", value, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyLessThan(String value) {
			addCriterion("owner_public_key <", value, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyLessThanOrEqualTo(String value) {
			addCriterion("owner_public_key <=", value, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyLike(String value) {
			addCriterion("owner_public_key like", value, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyNotLike(String value) {
			addCriterion("owner_public_key not like", value, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyIn(List<String> values) {
			addCriterion("owner_public_key in", values, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyNotIn(List<String> values) {
			addCriterion("owner_public_key not in", values, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyBetween(String value1, String value2) {
			addCriterion("owner_public_key between", value1, value2, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andOwnerPublicKeyNotBetween(String value1, String value2) {
			addCriterion("owner_public_key not between", value1, value2, "ownerPublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyIsNull() {
			addCriterion("active_public_key is null");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyIsNotNull() {
			addCriterion("active_public_key is not null");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyEqualTo(String value) {
			addCriterion("active_public_key =", value, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyNotEqualTo(String value) {
			addCriterion("active_public_key <>", value, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyGreaterThan(String value) {
			addCriterion("active_public_key >", value, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyGreaterThanOrEqualTo(String value) {
			addCriterion("active_public_key >=", value, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyLessThan(String value) {
			addCriterion("active_public_key <", value, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyLessThanOrEqualTo(String value) {
			addCriterion("active_public_key <=", value, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyLike(String value) {
			addCriterion("active_public_key like", value, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyNotLike(String value) {
			addCriterion("active_public_key not like", value, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyIn(List<String> values) {
			addCriterion("active_public_key in", values, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyNotIn(List<String> values) {
			addCriterion("active_public_key not in", values, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyBetween(String value1, String value2) {
			addCriterion("active_public_key between", value1, value2, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andActivePublicKeyNotBetween(String value1, String value2) {
			addCriterion("active_public_key not between", value1, value2, "activePublicKey");
			return (Criteria) this;
		}

		public Criteria andIpIsNull() {
			addCriterion("ip is null");
			return (Criteria) this;
		}

		public Criteria andIpIsNotNull() {
			addCriterion("ip is not null");
			return (Criteria) this;
		}

		public Criteria andIpEqualTo(String value) {
			addCriterion("ip =", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotEqualTo(String value) {
			addCriterion("ip <>", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThan(String value) {
			addCriterion("ip >", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThanOrEqualTo(String value) {
			addCriterion("ip >=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThan(String value) {
			addCriterion("ip <", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThanOrEqualTo(String value) {
			addCriterion("ip <=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLike(String value) {
			addCriterion("ip like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotLike(String value) {
			addCriterion("ip not like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpIn(List<String> values) {
			addCriterion("ip in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotIn(List<String> values) {
			addCriterion("ip not in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpBetween(String value1, String value2) {
			addCriterion("ip between", value1, value2, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotBetween(String value1, String value2) {
			addCriterion("ip not between", value1, value2, "ip");
			return (Criteria) this;
		}

		public Criteria andTransactionIdIsNull() {
			addCriterion("transaction_id is null");
			return (Criteria) this;
		}

		public Criteria andTransactionIdIsNotNull() {
			addCriterion("transaction_id is not null");
			return (Criteria) this;
		}

		public Criteria andTransactionIdEqualTo(String value) {
			addCriterion("transaction_id =", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdNotEqualTo(String value) {
			addCriterion("transaction_id <>", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdGreaterThan(String value) {
			addCriterion("transaction_id >", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
			addCriterion("transaction_id >=", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdLessThan(String value) {
			addCriterion("transaction_id <", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdLessThanOrEqualTo(String value) {
			addCriterion("transaction_id <=", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdLike(String value) {
			addCriterion("transaction_id like", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdNotLike(String value) {
			addCriterion("transaction_id not like", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdIn(List<String> values) {
			addCriterion("transaction_id in", values, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdNotIn(List<String> values) {
			addCriterion("transaction_id not in", values, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdBetween(String value1, String value2) {
			addCriterion("transaction_id between", value1, value2, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdNotBetween(String value1, String value2) {
			addCriterion("transaction_id not between", value1, value2, "transactionId");
			return (Criteria) this;
		}

		public Criteria andNotifyDateIsNull() {
			addCriterion("notify_date is null");
			return (Criteria) this;
		}

		public Criteria andNotifyDateIsNotNull() {
			addCriterion("notify_date is not null");
			return (Criteria) this;
		}

		public Criteria andNotifyDateEqualTo(Date value) {
			addCriterion("notify_date =", value, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andNotifyDateNotEqualTo(Date value) {
			addCriterion("notify_date <>", value, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andNotifyDateGreaterThan(Date value) {
			addCriterion("notify_date >", value, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andNotifyDateGreaterThanOrEqualTo(Date value) {
			addCriterion("notify_date >=", value, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andNotifyDateLessThan(Date value) {
			addCriterion("notify_date <", value, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andNotifyDateLessThanOrEqualTo(Date value) {
			addCriterion("notify_date <=", value, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andNotifyDateIn(List<Date> values) {
			addCriterion("notify_date in", values, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andNotifyDateNotIn(List<Date> values) {
			addCriterion("notify_date not in", values, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andNotifyDateBetween(Date value1, Date value2) {
			addCriterion("notify_date between", value1, value2, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andNotifyDateNotBetween(Date value1, Date value2) {
			addCriterion("notify_date not between", value1, value2, "notifyDate");
			return (Criteria) this;
		}

		public Criteria andCreatedateIsNull() {
			addCriterion("createdate is null");
			return (Criteria) this;
		}

		public Criteria andCreatedateIsNotNull() {
			addCriterion("createdate is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedateEqualTo(Date value) {
			addCriterion("createdate =", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotEqualTo(Date value) {
			addCriterion("createdate <>", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThan(Date value) {
			addCriterion("createdate >", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
			addCriterion("createdate >=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThan(Date value) {
			addCriterion("createdate <", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThanOrEqualTo(Date value) {
			addCriterion("createdate <=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateIn(List<Date> values) {
			addCriterion("createdate in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotIn(List<Date> values) {
			addCriterion("createdate not in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateBetween(Date value1, Date value2) {
			addCriterion("createdate between", value1, value2, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotBetween(Date value1, Date value2) {
			addCriterion("createdate not between", value1, value2, "createdate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateIsNull() {
			addCriterion("updatedate is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedateIsNotNull() {
			addCriterion("updatedate is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedateEqualTo(Date value) {
			addCriterion("updatedate =", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateNotEqualTo(Date value) {
			addCriterion("updatedate <>", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateGreaterThan(Date value) {
			addCriterion("updatedate >", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
			addCriterion("updatedate >=", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateLessThan(Date value) {
			addCriterion("updatedate <", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
			addCriterion("updatedate <=", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateIn(List<Date> values) {
			addCriterion("updatedate in", values, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateNotIn(List<Date> values) {
			addCriterion("updatedate not in", values, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateBetween(Date value1, Date value2) {
			addCriterion("updatedate between", value1, value2, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
			addCriterion("updatedate not between", value1, value2, "updatedate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table eos_account_order
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 08 18:04:45 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}