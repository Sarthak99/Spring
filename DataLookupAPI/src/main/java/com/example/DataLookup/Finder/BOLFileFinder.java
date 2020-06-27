package com.example.DataLookup.Finder;

import com.example.DataLookup.Entities.BillOfLadingMessageEntity;

public interface BOLFileFinder {

	public BillOfLadingMessageEntity findData(String fileName, String depotId);

}