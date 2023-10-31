(ns dots.typescript.text-span)

(defn start
  ^js [text-span]
  (.-start ^js text-span))

(defn set-start!
  ^js [text-span value]
  (set! (.-start ^js text-span) value))

(defn length
  ^js [text-span]
  (.-length ^js text-span))

(defn set-length!
  ^js [text-span value]
  (set! (.-length ^js text-span) value))
