(ns dots.typescript.package-json-info-cache)

(defn clear
  ^js [package-json-info-cache]
  (.clear ^js package-json-info-cache))
