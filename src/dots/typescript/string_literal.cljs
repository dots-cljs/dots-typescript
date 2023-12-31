(ns dots.typescript.string-literal)

(defn kind
  ^js [string-literal]
  (.-kind ^js string-literal))

(defn text
  ^js [string-literal]
  (.-text ^js string-literal))

(defn set-text!
  ^js [string-literal value]
  (set! (.-text ^js string-literal) value))

(defn unterminated?
  ^js [string-literal]
  (.-isUnterminated ^js string-literal))

(defn set-is-unterminated!
  ^js [string-literal value]
  (set! (.-isUnterminated ^js string-literal) value))

(defn has-extended-unicode-escape?
  ^js [string-literal]
  (.-hasExtendedUnicodeEscape ^js string-literal))

(defn set-has-extended-unicode-escape!
  ^js [string-literal value]
  (set! (.-hasExtendedUnicodeEscape ^js string-literal) value))

(defn flags
  ^js [string-literal]
  (.-flags ^js string-literal))

(defn parent
  ^js [string-literal]
  (.-parent ^js string-literal))

(defn source-file
  ^js [string-literal]
  (.getSourceFile ^js string-literal))

(defn child-count
  (^js [string-literal]
   (.getChildCount ^js string-literal))
  (^js [string-literal source-file]
   (.getChildCount ^js string-literal source-file)))

(defn child-at
  (^js [string-literal index]
   (.getChildAt ^js string-literal index))
  (^js [string-literal index source-file]
   (.getChildAt ^js string-literal index source-file)))

(defn children
  (^js [string-literal]
   (.getChildren ^js string-literal))
  (^js [string-literal source-file]
   (.getChildren ^js string-literal source-file)))

(defn start
  (^js [string-literal]
   (.getStart ^js string-literal))
  (^js [string-literal source-file]
   (.getStart ^js string-literal source-file))
  (^js [string-literal source-file include-js-doc-comment?]
   (.getStart ^js string-literal source-file include-js-doc-comment?)))

(defn full-start
  ^js [string-literal]
  (.getFullStart ^js string-literal))

(defn get-end
  ^js [string-literal]
  (.getEnd ^js string-literal))

(defn width
  (^js [string-literal]
   (.getWidth ^js string-literal))
  (^js [string-literal source-file]
   (.getWidth ^js string-literal source-file)))

(defn full-width
  ^js [string-literal]
  (.getFullWidth ^js string-literal))

(defn leading-trivia-width
  (^js [string-literal]
   (.getLeadingTriviaWidth ^js string-literal))
  (^js [string-literal source-file]
   (.getLeadingTriviaWidth ^js string-literal source-file)))

(defn full-text
  (^js [string-literal]
   (.getFullText ^js string-literal))
  (^js [string-literal source-file]
   (.getFullText ^js string-literal source-file)))

(defn get-text
  (^js [string-literal]
   (.getText ^js string-literal))
  (^js [string-literal source-file]
   (.getText ^js string-literal source-file)))

(defn first-token
  (^js [string-literal]
   (.getFirstToken ^js string-literal))
  (^js [string-literal source-file]
   (.getFirstToken ^js string-literal source-file)))

(defn last-token
  (^js [string-literal]
   (.getLastToken ^js string-literal))
  (^js [string-literal source-file]
   (.getLastToken ^js string-literal source-file)))

(defn for-each-child
  (^js [string-literal cb-node]
   (.forEachChild ^js string-literal cb-node))
  (^js [string-literal cb-node cb-node-array]
   (.forEachChild ^js string-literal cb-node cb-node-array)))

(defn pos
  ^js [string-literal]
  (.-pos ^js string-literal))

(defn end
  ^js [string-literal]
  (.-end ^js string-literal))
