package cn.idealismxxm.client.common.query;

import cn.idealismxxm.client.enums.FieldEnumInterface;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 字段 查询 构造器
 *
 * @author idealism
 * @date 2018/9/12
 */
public class FieldQueryBuilder<T extends FieldEnumInterface> {
    /**
     * 相等/不等 条件 对于字段 个体 值有效
     */
    private List<FieldUnitItem<T>> equalClauses = new LinkedList<>();
    private List<FieldUnitItem<T>> notEqualClauses = new LinkedList<>();

    /**
     * 在集合中/不在集合中 条件 对于字段 数组 值有效
     */
    private List<FieldArrayItem<T>> inClauses = new LinkedList<>();
    private List<FieldArrayItem<T>> notInClauses = new LinkedList<>();

    /**
     * 在范围内/不在范围内 条件 对于字段 范围 值有效
     */
    private List<FieldRangeItem<T>> betweenClauses = new LinkedList<>();
    private List<FieldRangeItem<T>> notBetweenClauses = new LinkedList<>();

    /**
     * 排序条件
     */
    private List<FieldSort<T>> sorts = new LinkedList<>();

    /**
     * 页号
     */
    private int page;
    /**
     * 页大小
     */
    private int pageSize;

    public List<FieldUnitItem<T>> getEqualClauses() {
        return equalClauses;
    }

    public void setEqualClauses(List<FieldUnitItem<T>> equalClauses) {
        this.equalClauses = equalClauses;
    }

    public List<FieldUnitItem<T>> getNotEqualClauses() {
        return notEqualClauses;
    }

    public void setNotEqualClauses(List<FieldUnitItem<T>> notEqualClauses) {
        this.notEqualClauses = notEqualClauses;
    }

    public List<FieldArrayItem<T>> getInClauses() {
        return inClauses;
    }

    public void setInClauses(List<FieldArrayItem<T>> inClauses) {
        this.inClauses = inClauses;
    }

    public List<FieldArrayItem<T>> getNotInClauses() {
        return notInClauses;
    }

    public void setNotInClauses(List<FieldArrayItem<T>> notInClauses) {
        this.notInClauses = notInClauses;
    }

    public List<FieldRangeItem<T>> getBetweenClauses() {
        return betweenClauses;
    }

    public void setBetweenClauses(List<FieldRangeItem<T>> betweenClauses) {
        this.betweenClauses = betweenClauses;
    }

    public List<FieldRangeItem<T>> getNotBetweenClauses() {
        return notBetweenClauses;
    }

    public void setNotBetweenClauses(List<FieldRangeItem<T>> notBetweenClauses) {
        this.notBetweenClauses = notBetweenClauses;
    }

    public List<FieldSort<T>> getSorts() {
        return sorts;
    }

    public void setSorts(List<FieldSort<T>> sorts) {
        this.sorts = sorts;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void equal(T fieldEnum, int value) {
        this.equalClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void equal(T fieldEnum, long value) {
        this.equalClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void equal(T fieldEnum, float value) {
        this.equalClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void equal(T fieldEnum, double value) {
        this.equalClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void equal(T fieldEnum, boolean value) {
        this.equalClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void equal(T fieldEnum, String value) {
        this.equalClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void equal(T fieldEnum, Date value) {
        this.equalClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void notEqual(T fieldEnum, int value) {
        this.notEqualClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void notEqual(T fieldEnum, long value) {
        this.notEqualClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void notEqual(T fieldEnum, float value) {
        this.notEqualClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void notEqual(T fieldEnum, double value) {
        this.notEqualClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void notEqual(T fieldEnum, boolean value) {
        this.notEqualClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void notEqual(T fieldEnum, String value) {
        this.notEqualClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void notEqual(T fieldEnum, Date value) {
        this.notEqualClauses.add(new FieldUnitItem<>(fieldEnum, value));
    }

    public void in(T fieldEnum, int... value) {
        this.inClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void in(T fieldEnum, long... value) {
        this.inClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void in(T fieldEnum, float... value) {
        this.inClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void in(T fieldEnum, double... value) {
        this.inClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void in(T fieldEnum, String... value) {
        this.inClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void in(T fieldEnum, Date... value) {
        this.inClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void notIn(T fieldEnum, int... value) {
        this.notInClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void notIn(T fieldEnum, long... value) {
        this.notInClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void notIn(T fieldEnum, float... value) {
        this.notInClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void notIn(T fieldEnum, double... value) {
        this.notInClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void notIn(T fieldEnum, String... value) {
        this.notInClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    public void notIn(T fieldEnum, Date... value) {
        this.notInClauses.add(new FieldArrayItem<>(fieldEnum, value));
    }

    // TODO FieldArrayItem 不好实现（可再增加一个类专门生成条件）
}
