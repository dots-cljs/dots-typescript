(ns dots.typescript.call-hierarchy-incoming-call)

(defn from
  "**Returns:** `CallHierarchyItem`"
  ^js [call-hierarchy-incoming-call]
  (.-from ^js call-hierarchy-incoming-call))

(defn set-from!
  ^js [call-hierarchy-incoming-call value]
  (set! (.-from ^js call-hierarchy-incoming-call) value))

(defn from-spans
  "**Returns:** `TextSpan[]`"
  ^js [call-hierarchy-incoming-call]
  (.-fromSpans ^js call-hierarchy-incoming-call))

(defn set-from-spans!
  ^js [call-hierarchy-incoming-call value]
  (set! (.-fromSpans ^js call-hierarchy-incoming-call) value))
