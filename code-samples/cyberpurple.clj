(ns cyberpunk)

(defstruct hacker :address :created-at :last-login :skills)

(defn hack-level
  [hacker]
  (let [hack-period (- (hacker :last-login) (hacker :created-at))]
    (if (< hack-period 1000)
      1
      (if (< hack-period 5000)
        2
        (if (< hack-period 10000)
          3
          4)))))

;;...there was a guy named Neo
(let [hacker (struct hacker "Unknown" 1950 1990 '("Coding", "Hacking", "Cyber-Security"))]
  (println (hack-level hacker)))
