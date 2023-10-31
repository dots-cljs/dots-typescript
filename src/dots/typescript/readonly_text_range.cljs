(ns dots.typescript.readonly-text-range)

(defn pos
  ^js [readonly-text-range]
  (.-pos ^js readonly-text-range))

(defn end
  ^js [readonly-text-range]
  (.-end ^js readonly-text-range))
