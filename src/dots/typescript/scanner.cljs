(ns dots.typescript.scanner)

(defn start-pos
  ^js [scanner]
  (.getStartPos ^js scanner))

(defn token
  ^js [scanner]
  (.getToken ^js scanner))

(defn token-full-start
  ^js [scanner]
  (.getTokenFullStart ^js scanner))

(defn token-start
  ^js [scanner]
  (.getTokenStart ^js scanner))

(defn token-end
  ^js [scanner]
  (.getTokenEnd ^js scanner))

(defn text-pos
  ^js [scanner]
  (.getTextPos ^js scanner))

(defn token-pos
  ^js [scanner]
  (.getTokenPos ^js scanner))

(defn token-text
  ^js [scanner]
  (.getTokenText ^js scanner))

(defn token-value
  ^js [scanner]
  (.getTokenValue ^js scanner))

(defn has-unicode-escape?
  ^js [scanner]
  (.hasUnicodeEscape ^js scanner))

(defn has-extended-unicode-escape?
  ^js [scanner]
  (.hasExtendedUnicodeEscape ^js scanner))

(defn has-preceding-line-break?
  ^js [scanner]
  (.hasPrecedingLineBreak ^js scanner))

(defn identifier?
  ^js [scanner]
  (.isIdentifier ^js scanner))

(defn reserved-word?
  ^js [scanner]
  (.isReservedWord ^js scanner))

(defn unterminated?
  ^js [scanner]
  (.isUnterminated ^js scanner))

(defn re-scan-greater-token
  ^js [scanner]
  (.reScanGreaterToken ^js scanner))

(defn re-scan-slash-token
  ^js [scanner]
  (.reScanSlashToken ^js scanner))

(defn re-scan-asterisk-equals-token
  ^js [scanner]
  (.reScanAsteriskEqualsToken ^js scanner))

(defn re-scan-template-token
  ^js [scanner tagged-template?]
  (.reScanTemplateToken ^js scanner tagged-template?))

(defn re-scan-template-head-or-no-substitution-template
  ^js [scanner]
  (.reScanTemplateHeadOrNoSubstitutionTemplate ^js scanner))

(defn scan-jsx-identifier
  ^js [scanner]
  (.scanJsxIdentifier ^js scanner))

(defn scan-jsx-attribute-value
  ^js [scanner]
  (.scanJsxAttributeValue ^js scanner))

(defn re-scan-jsx-attribute-value
  ^js [scanner]
  (.reScanJsxAttributeValue ^js scanner))

(defn re-scan-jsx-token
  (^js [scanner]
   (.reScanJsxToken ^js scanner))
  (^js [scanner allow-multiline-jsx-text?]
   (.reScanJsxToken ^js scanner allow-multiline-jsx-text?)))

(defn re-scan-less-than-token
  ^js [scanner]
  (.reScanLessThanToken ^js scanner))

(defn re-scan-hash-token
  ^js [scanner]
  (.reScanHashToken ^js scanner))

(defn re-scan-question-token
  ^js [scanner]
  (.reScanQuestionToken ^js scanner))

(defn re-scan-invalid-identifier
  ^js [scanner]
  (.reScanInvalidIdentifier ^js scanner))

(defn scan-jsx-token
  ^js [scanner]
  (.scanJsxToken ^js scanner))

(defn scan-js-doc-token
  ^js [scanner]
  (.scanJsDocToken ^js scanner))

(defn scan
  ^js [scanner]
  (.scan ^js scanner))

(defn text
  ^js [scanner]
  (.getText ^js scanner))

(defn set-text
  (^js [scanner]
   (.setText ^js scanner))
  (^js [scanner text]
   (.setText ^js scanner text))
  (^js [scanner text start]
   (.setText ^js scanner text start))
  (^js [scanner text start length]
   (.setText ^js scanner text start length)))

(defn set-on-error
  (^js [scanner]
   (.setOnError ^js scanner))
  (^js [scanner on-error]
   (.setOnError ^js scanner on-error)))

(defn set-script-target
  ^js [scanner script-target]
  (.setScriptTarget ^js scanner script-target))

(defn set-language-variant
  ^js [scanner variant]
  (.setLanguageVariant ^js scanner variant))

(defn set-text-pos
  ^js [scanner text-pos]
  (.setTextPos ^js scanner text-pos))

(defn reset-token-state
  ^js [scanner pos]
  (.resetTokenState ^js scanner pos))

(defn look-ahead
  ^js [scanner callback]
  (.lookAhead ^js scanner callback))

(defn scan-range
  ^js [scanner start length callback]
  (.scanRange ^js scanner start length callback))

(defn try-scan
  ^js [scanner callback]
  (.tryScan ^js scanner callback))
