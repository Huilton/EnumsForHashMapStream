import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum EnumsTeste {

	J(11,"Letra J vale 11"), Q(12,"Letra q vale 12");

	private int code;
	private String descricao;

	public int getCode() {
		return code;
	}

	public String getDescricao() {
		return descricao;
	}

	EnumsTeste(int code, String descricao) {
		this.code = code;
		this.descricao = descricao;
	}
	
	private EnumsTeste() {
	
	}

	public static Map<Integer, String> mapEnums =Stream.of( EnumsTeste.values() )
			.collect( Collectors.toMap( k -> k.code, v -> v.descricao ) );
}
