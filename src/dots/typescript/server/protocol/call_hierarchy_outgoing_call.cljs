(ns dots.typescript.server.protocol.call-hierarchy-outgoing-call)

(defn to
  ^js [call-hierarchy-outgoing-call]
  (.-to ^js call-hierarchy-outgoing-call))

(defn set-to!
  ^js [call-hierarchy-outgoing-call value]
  (set! (.-to ^js call-hierarchy-outgoing-call) value))

(defn from-spans
  ^js [call-hierarchy-outgoing-call]
  (.-fromSpans ^js call-hierarchy-outgoing-call))

(defn set-from-spans!
  ^js [call-hierarchy-outgoing-call value]
  (set! (.-fromSpans ^js call-hierarchy-outgoing-call) value))
