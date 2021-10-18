package edu.bjtu.back.vo;

import edu.bjtu.back.pojo.EntrustWorking;

import java.util.List;

public class EntrustWorkingData {
    private int total;  // 这个order应该用什么数据类型
    private int pages;
    private List<EntrustWorking> records;
    private int page;

    @Override
    public String toString() {
        return "EntrustWorkingData{" +
                "total=" + total +
                ", pages=" + pages +
                ", records=" + records +
                ", page=" + page +
                '}';
    }

    public EntrustWorkingData(int total, int pages, List<EntrustWorking> records, int page) {
        this.total = total;
        this.pages = pages;
        this.records = records;
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<EntrustWorking> getRecords() {
        return records;
    }

    public void setRecords(List<EntrustWorking> records) {
        this.records = records;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
