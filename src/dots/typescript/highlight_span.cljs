(ns dots.typescript.highlight-span)

(defn file-name
  ^js [highlight-span]
  (.-fileName ^js highlight-span))

(defn set-file-name!
  ^js [highlight-span value]
  (set! (.-fileName ^js highlight-span) value))

(defn in-string
  ^js [highlight-span]
  (.-isInString ^js highlight-span))

(defn set-is-in-string!
  ^js [highlight-span value]
  (set! (.-isInString ^js highlight-span) value))

(defn text-span
  ^js [highlight-span]
  (.-textSpan ^js highlight-span))

(defn set-text-span!
  ^js [highlight-span value]
  (set! (.-textSpan ^js highlight-span) value))

(defn context-span
  ^js [highlight-span]
  (.-contextSpan ^js highlight-span))

(defn set-context-span!
  ^js [highlight-span value]
  (set! (.-contextSpan ^js highlight-span) value))

(defn kind
  ^js [highlight-span]
  (.-kind ^js highlight-span))

(defn set-kind!
  ^js [highlight-span value]
  (set! (.-kind ^js highlight-span) value))
