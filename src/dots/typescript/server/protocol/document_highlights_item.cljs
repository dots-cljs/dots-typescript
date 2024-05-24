(ns dots.typescript.server.protocol.document-highlights-item
  "Represents a set of highligh spans for a give name")

(defn file
  "File containing highlight spans."
  ^js [document-highlights-item]
  (.-file ^js document-highlights-item))

(defn set-file!
  "File containing highlight spans."
  ^js [document-highlights-item value]
  (set! (.-file ^js document-highlights-item) value))

(defn highlight-spans
  "Spans to highlight in file."
  ^js [document-highlights-item]
  (.-highlightSpans ^js document-highlights-item))

(defn set-highlight-spans!
  "Spans to highlight in file."
  ^js [document-highlights-item value]
  (set! (.-highlightSpans ^js document-highlights-item) value))
