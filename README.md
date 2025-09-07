# 🧬 BioSeqAlign - DNA Sequence Alignment in Java

## 📖 Overview
BioSeqAlign is a Java-based tool for aligning DNA sequences using **Dynamic Programming**.  
It identifies the **Longest Common Subsequence (LCS)** between two DNA strands, highlighting similarities that may indicate functional or evolutionary relationships.

---

## ✨ Features
- Implements the **Longest Common Subsequence (LCS)** algorithm.
- Efficient sequence alignment using **dynamic programming**.
- Clear console output with subsequence and length.

---

## ⚙️ Installation & Execution

1. Clone this repository:
   ```bash
   git clone https://github.com/Dakarplay/BioSeqAlign.git
   cd BioSeqAlign

2. Compile the project

    javac -d bin src/lib/LCS.java src/App.java

3. Run the program:

    java -cp bin App

## 🖥️ Usage
The input DNA sequences are defined in App.java.
Modify the variables X and Y to test different alignments.

## Example

Input: 

    - Sequence 1: ACTGAAAAATTTTTTTTTTTTTCCGGGGGGGGGGAAAAAAA
    - Sequence 2: TCAAGGGGGTCAAAAAAAAAAACGTGA

Output:

    - Longest Common Subsequence: TAAGGGGGAAAAAAA

## 📊 Complexity Analysis

    - Time Complexity: O(m * n)

    - Space Complexity: O(m * n)

Where m and n are the lengths of the input sequences.

## Author
Developed by Dago Palmera