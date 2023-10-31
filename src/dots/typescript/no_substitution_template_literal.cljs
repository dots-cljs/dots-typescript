(ns dots.typescript.no-substitution-template-literal)

(defn kind
  ^js [no-substitution-template-literal]
  (.-kind ^js no-substitution-template-literal))

(defn text
  ^js [no-substitution-template-literal]
  (.-text ^js no-substitution-template-literal))

(defn set-text!
  ^js [no-substitution-template-literal value]
  (set! (.-text ^js no-substitution-template-literal) value))

(defn unterminated?
  ^js [no-substitution-template-literal]
  (.-isUnterminated ^js no-substitution-template-literal))

(defn set-is-unterminated!
  ^js [no-substitution-template-literal value]
  (set! (.-isUnterminated ^js no-substitution-template-literal) value))

(defn has-extended-unicode-escape?
  ^js [no-substitution-template-literal]
  (.-hasExtendedUnicodeEscape ^js no-substitution-template-literal))

(defn set-has-extended-unicode-escape!
  ^js [no-substitution-template-literal value]
  (set! (.-hasExtendedUnicodeEscape ^js no-substitution-template-literal) value))

(defn flags
  ^js [no-substitution-template-literal]
  (.-flags ^js no-substitution-template-literal))

(defn parent
  ^js [no-substitution-template-literal]
  (.-parent ^js no-substitution-template-literal))

(defn source-file
  ^js [no-substitution-template-literal]
  (.getSourceFile ^js no-substitution-template-literal))

(defn child-count
  (^js [no-substitution-template-literal]
   (.getChildCount ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getChildCount ^js no-substitution-template-literal source-file)))

(defn child-at
  (^js [no-substitution-template-literal index]
   (.getChildAt ^js no-substitution-template-literal index))
  (^js [no-substitution-template-literal index source-file]
   (.getChildAt ^js no-substitution-template-literal index source-file)))

(defn children
  (^js [no-substitution-template-literal]
   (.getChildren ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getChildren ^js no-substitution-template-literal source-file)))

(defn start
  (^js [no-substitution-template-literal]
   (.getStart ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getStart ^js no-substitution-template-literal source-file))
  (^js [no-substitution-template-literal source-file include-js-doc-comment?]
   (.getStart ^js no-substitution-template-literal source-file include-js-doc-comment?)))

(defn full-start
  ^js [no-substitution-template-literal]
  (.getFullStart ^js no-substitution-template-literal))

(defn get-end
  ^js [no-substitution-template-literal]
  (.getEnd ^js no-substitution-template-literal))

(defn width
  (^js [no-substitution-template-literal]
   (.getWidth ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getWidth ^js no-substitution-template-literal source-file)))

(defn full-width
  ^js [no-substitution-template-literal]
  (.getFullWidth ^js no-substitution-template-literal))

(defn leading-trivia-width
  (^js [no-substitution-template-literal]
   (.getLeadingTriviaWidth ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getLeadingTriviaWidth ^js no-substitution-template-literal source-file)))

(defn full-text
  (^js [no-substitution-template-literal]
   (.getFullText ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getFullText ^js no-substitution-template-literal source-file)))

(defn get-text
  (^js [no-substitution-template-literal]
   (.getText ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getText ^js no-substitution-template-literal source-file)))

(defn first-token
  (^js [no-substitution-template-literal]
   (.getFirstToken ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getFirstToken ^js no-substitution-template-literal source-file)))

(defn last-token
  (^js [no-substitution-template-literal]
   (.getLastToken ^js no-substitution-template-literal))
  (^js [no-substitution-template-literal source-file]
   (.getLastToken ^js no-substitution-template-literal source-file)))

(defn for-each-child
  (^js [no-substitution-template-literal cb-node]
   (.forEachChild ^js no-substitution-template-literal cb-node))
  (^js [no-substitution-template-literal cb-node cb-node-array]
   (.forEachChild ^js no-substitution-template-literal cb-node cb-node-array)))

(defn decorators
  ^js [no-substitution-template-literal]
  (.-decorators ^js no-substitution-template-literal))

(defn modifiers
  ^js [no-substitution-template-literal]
  (.-modifiers ^js no-substitution-template-literal))

(defn pos
  ^js [no-substitution-template-literal]
  (.-pos ^js no-substitution-template-literal))

(defn end
  ^js [no-substitution-template-literal]
  (.-end ^js no-substitution-template-literal))

(defn raw-text
  ^js [no-substitution-template-literal]
  (.-rawText ^js no-substitution-template-literal))

(defn set-raw-text!
  ^js [no-substitution-template-literal value]
  (set! (.-rawText ^js no-substitution-template-literal) value))
