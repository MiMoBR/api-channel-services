package com.mimobr.blogtwo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BLOG_CONTENT")
public class Content{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="ID")
	private Long Id;
	
	@Column(name="TITLE")	
	private String Title;
	
	@Column(name="SUBTITLE")
	private String SubTitle;

	@Column(name="CONTENT")
	private String Content;

	@Column(name="PIC1")
	private String Pic1;

	@Column(name="PIC2")
	private String Pic2;
	
	@Column(name="URL1")
	private String Url1;
	
	@Column(name="URL2")
	private String Url2;
	
	@Column(name="SEOLOGO")
	private String SeoLogo;
	
	@Column(name="SEOSITE")
	private String SeoSite;
	
	@Column(name="SEOTYPE")
	private String SeoType;
	
	@Column(name="SEOAUTHOR")
	private String SeoAuthor;
	
	@Column(name="SEOCOMPANY")
	private String SeoCompany;
	
	@Column(name="SEOTELEPHONE")
	private String SeoTelephone;
	
	@Column(name="SEOADDRESS")
	private String SeoAddress;
	
	@Column(name="SEOLOCALITY")
	private String SeoLocality;
	
	@Column(name="SEOCOUNTY")
	private String SeoCounty;
	
	@Column(name="SEOCOUNTRY")
	private String SeoCountry;
	
	@Column(name="SEOPOSTECODE")
	private String SeoPosteCode;
	
	@Column(name="SEOHASMAP")
	private String SeoHasMap;
	
	@Column(name="SEOTWITTER")
	private String SeoTwitter;
	
	@Column(name="SEOOPENINGHOURS")
	private String SeoOpeningHours;
	
	@Column(name="URL")
	private String Url;
	
	@Column(name="DT_CREATED")
	private String DtCreated;
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getSubTitle() {
		return SubTitle;
	}

	public void setSubTitle(String subTitle) {
		SubTitle = subTitle;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getPic1() {
		return Pic1;
	}

	public void setPic1(String pic1) {
		Pic1 = pic1;
	}

	public String getPic2() {
		return Pic2;
	}

	public void setPic2(String pic2) {
		Pic2 = pic2;
	}

	public String getUrl1() {
		return Url1;
	}

	public void setUrl1(String url1) {
		Url1 = url1;
	}

	public String getUrl2() {
		return Url2;
	}

	public void setUrl2(String url2) {
		Url2 = url2;
	}

	public String getSeoLogo() {
		return SeoLogo;
	}

	public void setSeoLogo(String seoLogo) {
		SeoLogo = seoLogo;
	}

	public String getSeoSite() {
		return SeoSite;
	}

	public void setSeoSite(String seoSite) {
		SeoSite = seoSite;
	}

	public String getSeoType() {
		return SeoType;
	}

	public void setSeoType(String seoType) {
		SeoType = seoType;
	}

	public String getSeoAuthor() {
		return SeoAuthor;
	}

	public void setSeoAuthor(String seoAuthor) {
		SeoAuthor = seoAuthor;
	}

	public String getSeoCompany() {
		return SeoCompany;
	}

	public void setSeoCompany(String seoCompany) {
		SeoCompany = seoCompany;
	}

	public String getSeoTelephone() {
		return SeoTelephone;
	}

	public void setSeoTelephone(String seoTelephone) {
		SeoTelephone = seoTelephone;
	}

	public String getSeoAddress() {
		return SeoAddress;
	}

	public void setSeoAddress(String seoAddress) {
		SeoAddress = seoAddress;
	}

	public String getSeoLocality() {
		return SeoLocality;
	}

	public void setSeoLocality(String seoLocality) {
		SeoLocality = seoLocality;
	}

	public String getSeoCounty() {
		return SeoCounty;
	}

	public void setSeoCounty(String seoCounty) {
		SeoCounty = seoCounty;
	}

	public String getSeoCountry() {
		return SeoCountry;
	}

	public void setSeoCountry(String seoCountry) {
		SeoCountry = seoCountry;
	}

	public String getSeoPosteCode() {
		return SeoPosteCode;
	}

	public void setSeoPosteCode(String seoPosteCode) {
		SeoPosteCode = seoPosteCode;
	}

	public String getSeoHasMap() {
		return SeoHasMap;
	}

	public void setSeoHasMap(String seoHasMap) {
		SeoHasMap = seoHasMap;
	}

	public String getSeoTwitter() {
		return SeoTwitter;
	}

	public void setSeoTwitter(String seoTwitter) {
		SeoTwitter = seoTwitter;
	}

	public String getSeoOpeningHours() {
		return SeoOpeningHours;
	}

	public void setSeoOpeningHours(String seoOpeningHours) {
		SeoOpeningHours = seoOpeningHours;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getDtCreated() {
		return DtCreated;
	}

	public void setDtCreated(String dtCreated) {
		DtCreated = dtCreated;
	}

}