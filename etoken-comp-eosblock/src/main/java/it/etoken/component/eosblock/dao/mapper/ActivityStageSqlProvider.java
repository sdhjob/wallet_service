package it.etoken.component.eosblock.dao.mapper;

import it.etoken.base.model.eosblock.entity.ActivityStage;
import it.etoken.base.model.eosblock.entity.ActivityStageExample.Criteria;
import it.etoken.base.model.eosblock.entity.ActivityStageExample.Criterion;
import it.etoken.base.model.eosblock.entity.ActivityStageExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ActivityStageSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_stage
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String countByExample(ActivityStageExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("activity_stage");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_stage
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String deleteByExample(ActivityStageExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("activity_stage");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_stage
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String insertSelective(ActivityStage record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("activity_stage");
		if (record.getId() != null) {
			sql.VALUES("id", "#{id,jdbcType=BIGINT}");
		}
		if (record.getActivityId() != null) {
			sql.VALUES("activity_id", "#{activityId,jdbcType=BIGINT}");
		}
		if (record.getName() != null) {
			sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
		}
		if (record.getStatus() != null) {
			sql.VALUES("status", "#{status,jdbcType=VARCHAR}");
		}
		if (record.getStartDate() != null) {
			sql.VALUES("start_date", "#{startDate,jdbcType=TIMESTAMP}");
		}
		if (record.getEndDate() != null) {
			sql.VALUES("end_date", "#{endDate,jdbcType=TIMESTAMP}");
		}
		if (record.getCommonCount() != null) {
			sql.VALUES("common_count", "#{commonCount,jdbcType=BIGINT}");
		}
		if (record.getCommonMinQty() != null) {
			sql.VALUES("common_min_qty", "#{commonMinQty,jdbcType=BIGINT}");
		}
		if (record.getCommonMaxQty() != null) {
			sql.VALUES("common_max_qty", "#{commonMaxQty,jdbcType=BIGINT}");
		}
		if (record.getLuckyCount() != null) {
			sql.VALUES("lucky_count", "#{luckyCount,jdbcType=BIGINT}");
		}
		if (record.getLuckyCoinQty() != null) {
			sql.VALUES("lucky_coin_qty", "#{luckyCoinQty,jdbcType=BIGINT}");
		}
		if (record.getLuckyMethod() != null) {
			sql.VALUES("lucky_method", "#{luckyMethod,jdbcType=VARCHAR}");
		}
		if (record.getTokenName() != null) {
			sql.VALUES("token_name", "#{tokenName,jdbcType=VARCHAR}");
		}
		if (record.getTokenContract() != null) {
			sql.VALUES("token_contract", "#{tokenContract,jdbcType=VARCHAR}");
		}
		if (record.getPrecisionNumber() != null) {
			sql.VALUES("precision_number", "#{precisionNumber,jdbcType=INTEGER}");
		}
		if (record.getSeq() != null) {
			sql.VALUES("seq", "#{seq,jdbcType=INTEGER}");
		}
		if (record.getIsPaid() != null) {
			sql.VALUES("is_paid", "#{isPaid,jdbcType=VARCHAR}");
		}
		if (record.getNeedBuyEos() != null) {
			sql.VALUES("need_buy_eos", "#{needBuyEos,jdbcType=BIGINT}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_stage
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String selectByExample(ActivityStageExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id");
		} else {
			sql.SELECT("id");
		}
		sql.SELECT("activity_id");
		sql.SELECT("name");
		sql.SELECT("status");
		sql.SELECT("start_date");
		sql.SELECT("end_date");
		sql.SELECT("common_count");
		sql.SELECT("common_min_qty");
		sql.SELECT("common_max_qty");
		sql.SELECT("lucky_count");
		sql.SELECT("lucky_coin_qty");
		sql.SELECT("lucky_method");
		sql.SELECT("token_name");
		sql.SELECT("token_contract");
		sql.SELECT("precision_number");
		sql.SELECT("seq");
		sql.SELECT("is_paid");
		sql.SELECT("need_buy_eos");
		sql.FROM("activity_stage");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_stage
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		ActivityStage record = (ActivityStage) parameter.get("record");
		ActivityStageExample example = (ActivityStageExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("activity_stage");
		if (record.getId() != null) {
			sql.SET("id = #{record.id,jdbcType=BIGINT}");
		}
		if (record.getActivityId() != null) {
			sql.SET("activity_id = #{record.activityId,jdbcType=BIGINT}");
		}
		if (record.getName() != null) {
			sql.SET("name = #{record.name,jdbcType=VARCHAR}");
		}
		if (record.getStatus() != null) {
			sql.SET("status = #{record.status,jdbcType=VARCHAR}");
		}
		if (record.getStartDate() != null) {
			sql.SET("start_date = #{record.startDate,jdbcType=TIMESTAMP}");
		}
		if (record.getEndDate() != null) {
			sql.SET("end_date = #{record.endDate,jdbcType=TIMESTAMP}");
		}
		if (record.getCommonCount() != null) {
			sql.SET("common_count = #{record.commonCount,jdbcType=BIGINT}");
		}
		if (record.getCommonMinQty() != null) {
			sql.SET("common_min_qty = #{record.commonMinQty,jdbcType=BIGINT}");
		}
		if (record.getCommonMaxQty() != null) {
			sql.SET("common_max_qty = #{record.commonMaxQty,jdbcType=BIGINT}");
		}
		if (record.getLuckyCount() != null) {
			sql.SET("lucky_count = #{record.luckyCount,jdbcType=BIGINT}");
		}
		if (record.getLuckyCoinQty() != null) {
			sql.SET("lucky_coin_qty = #{record.luckyCoinQty,jdbcType=BIGINT}");
		}
		if (record.getLuckyMethod() != null) {
			sql.SET("lucky_method = #{record.luckyMethod,jdbcType=VARCHAR}");
		}
		if (record.getTokenName() != null) {
			sql.SET("token_name = #{record.tokenName,jdbcType=VARCHAR}");
		}
		if (record.getTokenContract() != null) {
			sql.SET("token_contract = #{record.tokenContract,jdbcType=VARCHAR}");
		}
		if (record.getPrecisionNumber() != null) {
			sql.SET("precision_number = #{record.precisionNumber,jdbcType=INTEGER}");
		}
		if (record.getSeq() != null) {
			sql.SET("seq = #{record.seq,jdbcType=INTEGER}");
		}
		if (record.getIsPaid() != null) {
			sql.SET("is_paid = #{record.isPaid,jdbcType=VARCHAR}");
		}
		if (record.getNeedBuyEos() != null) {
			sql.SET("need_buy_eos = #{record.needBuyEos,jdbcType=BIGINT}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_stage
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("activity_stage");
		sql.SET("id = #{record.id,jdbcType=BIGINT}");
		sql.SET("activity_id = #{record.activityId,jdbcType=BIGINT}");
		sql.SET("name = #{record.name,jdbcType=VARCHAR}");
		sql.SET("status = #{record.status,jdbcType=VARCHAR}");
		sql.SET("start_date = #{record.startDate,jdbcType=TIMESTAMP}");
		sql.SET("end_date = #{record.endDate,jdbcType=TIMESTAMP}");
		sql.SET("common_count = #{record.commonCount,jdbcType=BIGINT}");
		sql.SET("common_min_qty = #{record.commonMinQty,jdbcType=BIGINT}");
		sql.SET("common_max_qty = #{record.commonMaxQty,jdbcType=BIGINT}");
		sql.SET("lucky_count = #{record.luckyCount,jdbcType=BIGINT}");
		sql.SET("lucky_coin_qty = #{record.luckyCoinQty,jdbcType=BIGINT}");
		sql.SET("lucky_method = #{record.luckyMethod,jdbcType=VARCHAR}");
		sql.SET("token_name = #{record.tokenName,jdbcType=VARCHAR}");
		sql.SET("token_contract = #{record.tokenContract,jdbcType=VARCHAR}");
		sql.SET("precision_number = #{record.precisionNumber,jdbcType=INTEGER}");
		sql.SET("seq = #{record.seq,jdbcType=INTEGER}");
		sql.SET("is_paid = #{record.isPaid,jdbcType=VARCHAR}");
		sql.SET("need_buy_eos = #{record.needBuyEos,jdbcType=BIGINT}");
		ActivityStageExample example = (ActivityStageExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_stage
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String updateByPrimaryKeySelective(ActivityStage record) {
		SQL sql = new SQL();
		sql.UPDATE("activity_stage");
		if (record.getActivityId() != null) {
			sql.SET("activity_id = #{activityId,jdbcType=BIGINT}");
		}
		if (record.getName() != null) {
			sql.SET("name = #{name,jdbcType=VARCHAR}");
		}
		if (record.getStatus() != null) {
			sql.SET("status = #{status,jdbcType=VARCHAR}");
		}
		if (record.getStartDate() != null) {
			sql.SET("start_date = #{startDate,jdbcType=TIMESTAMP}");
		}
		if (record.getEndDate() != null) {
			sql.SET("end_date = #{endDate,jdbcType=TIMESTAMP}");
		}
		if (record.getCommonCount() != null) {
			sql.SET("common_count = #{commonCount,jdbcType=BIGINT}");
		}
		if (record.getCommonMinQty() != null) {
			sql.SET("common_min_qty = #{commonMinQty,jdbcType=BIGINT}");
		}
		if (record.getCommonMaxQty() != null) {
			sql.SET("common_max_qty = #{commonMaxQty,jdbcType=BIGINT}");
		}
		if (record.getLuckyCount() != null) {
			sql.SET("lucky_count = #{luckyCount,jdbcType=BIGINT}");
		}
		if (record.getLuckyCoinQty() != null) {
			sql.SET("lucky_coin_qty = #{luckyCoinQty,jdbcType=BIGINT}");
		}
		if (record.getLuckyMethod() != null) {
			sql.SET("lucky_method = #{luckyMethod,jdbcType=VARCHAR}");
		}
		if (record.getTokenName() != null) {
			sql.SET("token_name = #{tokenName,jdbcType=VARCHAR}");
		}
		if (record.getTokenContract() != null) {
			sql.SET("token_contract = #{tokenContract,jdbcType=VARCHAR}");
		}
		if (record.getPrecisionNumber() != null) {
			sql.SET("precision_number = #{precisionNumber,jdbcType=INTEGER}");
		}
		if (record.getSeq() != null) {
			sql.SET("seq = #{seq,jdbcType=INTEGER}");
		}
		if (record.getIsPaid() != null) {
			sql.SET("is_paid = #{isPaid,jdbcType=VARCHAR}");
		}
		if (record.getNeedBuyEos() != null) {
			sql.SET("need_buy_eos = #{needBuyEos,jdbcType=BIGINT}");
		}
		sql.WHERE("id = #{id,jdbcType=BIGINT}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_stage
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	protected void applyWhere(SQL sql, ActivityStageExample example, boolean includeExamplePhrase) {
		if (example == null) {
			return;
		}
		String parmPhrase1;
		String parmPhrase1_th;
		String parmPhrase2;
		String parmPhrase2_th;
		String parmPhrase3;
		String parmPhrase3_th;
		if (includeExamplePhrase) {
			parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		} else {
			parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		}
		StringBuilder sb = new StringBuilder();
		List<Criteria> oredCriteria = example.getOredCriteria();
		boolean firstCriteria = true;
		for (int i = 0; i < oredCriteria.size(); i++) {
			Criteria criteria = oredCriteria.get(i);
			if (criteria.isValid()) {
				if (firstCriteria) {
					firstCriteria = false;
				} else {
					sb.append(" or ");
				}
				sb.append('(');
				List<Criterion> criterions = criteria.getAllCriteria();
				boolean firstCriterion = true;
				for (int j = 0; j < criterions.size(); j++) {
					Criterion criterion = criterions.get(j);
					if (firstCriterion) {
						firstCriterion = false;
					} else {
						sb.append(" and ");
					}
					if (criterion.isNoValue()) {
						sb.append(criterion.getCondition());
					} else if (criterion.isSingleValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
						} else {
							sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isBetweenValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
						} else {
							sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
						}
					} else if (criterion.isListValue()) {
						sb.append(criterion.getCondition());
						sb.append(" (");
						List<?> listItems = (List<?>) criterion.getValue();
						boolean comma = false;
						for (int k = 0; k < listItems.size(); k++) {
							if (comma) {
								sb.append(", ");
							} else {
								comma = true;
							}
							if (criterion.getTypeHandler() == null) {
								sb.append(String.format(parmPhrase3, i, j, k));
							} else {
								sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
							}
						}
						sb.append(')');
					}
				}
				sb.append(')');
			}
		}
		if (sb.length() > 0) {
			sql.WHERE(sb.toString());
		}
	}
}