# Aircraft Baggage System - Trace Table (Tabla de Seguimiento)

## 1. Input Test Data
Enter these weights sequentially when testing Option 1. The value `-1` is used to exit the input loop.

`15.0`, `0.0`, `25.0`, `26.0`, `150.0`, `300.0`, `301.0`, `450.0`, `500.0`, `550.0`, `200.0`, `12.5`, `280.0`, `400.0`, `50.0`, `-1`

---

## 2. Execution Trace

| Step | Input Weight (kg) | Status / Rule Applied | Cost Per Kg (COP) | Item Total Fee (COP) | Cumulative Weight (kg) | Valid Packages Count |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **1** | `15.0` | Accepted ($0-25$ kg) | $0 | $0 | 15.0 | 1 |
| **2** | `0.0` | Accepted ($0-25$ kg) | $0 | $0 | 15.0 | 2 |
| **3** | `25.0` | Accepted ($0-25$ kg) | $0 | $0 | 40.0 | 3 |
| **4** | `26.0` | Accepted ($26-300$ kg) | $1,500 | $39,000 | 66.0 | 4 |
| **5** | `150.0` | Accepted ($26-300$ kg) | $1,500 | $225,000 | 216.0 | 5 |
| **6** | `300.0` | Accepted ($26-300$ kg) | $1,500 | $450,000 | 516.0 | 6 |
| **7** | `301.0` | Accepted ($301-500$ kg) | $2,500 | $752,500 | 817.0 | 7 |
| **8** | `450.0` | Accepted ($301-500$ kg) | $2,500 | $1,125,000 | 1267.0 | 8 |
| **9** | `500.0` | Accepted ($301-500$ kg) | $2,500 | $1,250,000 | 1767.0 | 9 |
| **10**| `550.0` | **REJECTED** (> 500 kg limit) | N/A | $0 | 1767.0 | 9 |
| **11**| `200.0` | Accepted ($26-300$ kg) | $1,500 | $300,000 | 1967.0 | 10 |
| **12**| `12.5` | Accepted ($0-25$ kg) | $0 | $0 | 1979.5 | 11 |
| **13**| `280.0` | Accepted ($26-300$ kg) | $1,500 | $420,000 | 2259.5 | 12 |
| **14**| `400.0` | Accepted ($301-500$ kg) | $2,500 | $1,000,000 | 2659.5 | 13 |
| **15**| `50.0` | Accepted ($26-300$ kg) | $1,500 | $75,000 | 2709.5 | 14 |
| **16**| `-1` | EXIT LOOP | N/A | $0 | 2709.5 | 14 |

---

## 3. Expected Outputs by Menu Option

After inserting the data and returning to the main menu, verify that your options print exactly these results:

* **Option 2 (Total bags):** `14` *(Notice item 10 was successfully ignored)*
* **Option 3 (Heaviest):** `500.0 kg`
* **Option 3 (Lightest):** `12.5 kg` *(The code skips `0.0` as per your `if (packs.get(i) > 0)` logic)*
* **Option 4 (Average):** `193.53572 kg` *(2709.5 / 14)*
* **Option 5 (Revenue COP):** `$5,636,500.00`
* **Option 5 (Revenue USD):** `$1,693.15` *(Using exchange rate 1 USD = 3329 COP)*